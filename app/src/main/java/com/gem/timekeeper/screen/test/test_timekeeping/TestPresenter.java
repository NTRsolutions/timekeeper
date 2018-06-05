package com.gem.timekeeper.screen.test.test_timekeeping;

import android.os.Bundle;
import android.util.Log;

import com.gem.timekeeper.data.dto.TimeTrackDTO;
import com.gem.timekeeper.data.remote.callback.BaseListCallback;
import com.gem.timekeeper.data.remote.callback.BaseListResponse;
import com.gemvietnam.base.viper.Presenter;
import com.gemvietnam.base.viper.interfaces.ContainerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;

/**
 * The Test Presenter
 */
public class TestPresenter extends Presenter<TestContract.View, TestContract.Interactor> implements TestContract.Presenter {

  public TestPresenter(ContainerView containerView) {
    super(containerView);
  }

  @Override
  public void start() {

  }

  @Override
  public TestContract.Interactor onCreateInteractor() {
    return new TestInteractor(this);
  }

  @Override
  public TestContract.View onCreateView(Bundle data) {
    return TestFragment.getInstance(data);
  }

  @Override
  public void getListTimeTrack(String token) {
    getInteractor().getListTimeTrack(token, new BaseListCallback<BaseListResponse<TimeTrackDTO>>() {
      @Override
      public void onResponse(Call<BaseListResponse<TimeTrackDTO>> call, Response<BaseListResponse<TimeTrackDTO>> response) {
        super.onResponse(call, response);
        Log.d("Test",response.toString());
        BaseListResponse<TimeTrackDTO> baseListResponse=response.body();
        ArrayList<TimeTrackDTO> list=baseListResponse.getData().getList();
        getView().showTimeTrackList(list);
      }

      @Override
      public void onFailure(Call<BaseListResponse<TimeTrackDTO>> call, Throwable t) {
        super.onFailure(call, t);
      }
    });
  }

  @Override
  public void getListTimeTrack(String token, int page, int per_page, int month, int year) {

  }
}