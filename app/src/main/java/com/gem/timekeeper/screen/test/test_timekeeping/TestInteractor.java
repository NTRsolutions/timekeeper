package com.gem.timekeeper.screen.test.test_timekeeping;

import com.gem.timekeeper.data.dto.TimeTrackDTO;
import com.gem.timekeeper.data.remote.ServiceBuilder;
import com.gem.timekeeper.data.remote.callback.BaseListCallback;
import com.gem.timekeeper.data.remote.callback.BaseListResponse;
import com.gemvietnam.base.viper.Interactor;

/**
 * The Test interactor
 */
class TestInteractor extends Interactor<TestContract.Presenter> implements TestContract.Interactor {

  TestInteractor(TestContract.Presenter presenter) {
    super(presenter);
  }

  @Override
  public void getListTimeTrack(String token, BaseListCallback<BaseListResponse<TimeTrackDTO>> callback) {
    ServiceBuilder.getListTimeTrackService().getListTimeTrack(token).enqueue(callback);
  }

  @Override
  public void getListTimeTrack(String token, int page, int perPage, int month, int year, BaseListCallback<BaseListResponse<TimeTrackDTO>> callback) {
    ServiceBuilder.getListTimeTrackService().getListTimeTrack(token, page, perPage, month, year).enqueue(callback);
  }
}
