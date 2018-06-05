package com.gem.timekeeper.screen.test.test_timekeeping;

import android.os.Bundle;
import android.widget.Toast;

import com.gem.timekeeper.R;
import com.gem.timekeeper.data.dto.TimeTrackDTO;
import com.gemvietnam.base.viper.ViewFragment;

import java.util.ArrayList;

/**
 * The Test Fragment
 */
public class TestFragment extends ViewFragment<TestContract.Presenter> implements TestContract.View {

  public static TestFragment getInstance() {
    return new TestFragment();
  }

  public static TestFragment getInstance(Bundle data){
    TestFragment testFragment=new TestFragment();
    testFragment.setArguments(data);
    return testFragment;
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_test;
  }

  @Override
  public void initLayout() {
    super.initLayout();
    getPresenter().getListTimeTrack("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImp0aSI6Ik5nQm9Dd3pCcUR4ZUxUNnYifQ.eyJpc3MiOiJodHRwOlwvXC8xNzIuMTYuMTAuMTE6NTAwODAiLCJzdWIiOiI4MzEiLCJqdGkiOiJOZ0JvQ3d6QnFEeGVMVDZ2IiwiaWF0IjoxNTI4MTk0ODAxLCJuYmYiOjE1MjgxOTQ4MDEsImV4cCI6MTUyODE5NDg2MSwicmxpIjoxNTI4NjI2ODYxfQ.zLfyCU7qeRpP8ZHuR2xv7SSoIimWrZHU7aLFDbkEft4");
  }

  @Override
  public void showTimeTrackList(ArrayList<TimeTrackDTO> timeTrackDTO) {
    Toast.makeText(getContext(), ""+timeTrackDTO.size(), Toast.LENGTH_SHORT).show();
  }
}
