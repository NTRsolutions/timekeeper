package com.gem.timekeeper.screen.test.test_timekeeping;

import com.gem.timekeeper.data.dto.TimeTrackDTO;
import com.gem.timekeeper.data.remote.callback.BaseListCallback;
import com.gem.timekeeper.data.remote.callback.BaseListResponse;
import com.gemvietnam.base.viper.interfaces.IInteractor;
import com.gemvietnam.base.viper.interfaces.IPresenter;
import com.gemvietnam.base.viper.interfaces.PresentView;

import java.util.ArrayList;

/**
 * The Test Contract
 */
interface TestContract {

  interface Interactor extends IInteractor<Presenter> {
    void getListTimeTrack(String token, BaseListCallback<BaseListResponse<TimeTrackDTO>> callback);

    void getListTimeTrack(String token, int page, int perPage, int month, int year, BaseListCallback<BaseListResponse<TimeTrackDTO>> callback);
  }

  interface View extends PresentView<Presenter> {
    void showTimeTrackList(ArrayList<TimeTrackDTO> timeTrackDTO);
  }

  interface Presenter extends IPresenter<View, Interactor> {
    void getListTimeTrack(String token);

    void getListTimeTrack(String token, int page, int perPage, int month, int year);
  }
}



