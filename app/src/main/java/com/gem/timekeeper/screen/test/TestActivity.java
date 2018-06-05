package com.gem.timekeeper.screen.test;

import com.gem.timekeeper.screen.base.AppBaseActivity;
import com.gem.timekeeper.screen.test.test_timekeeping.TestPresenter;
import com.gemvietnam.base.viper.ViewFragment;

public class TestActivity extends AppBaseActivity{

  @Override
  public ViewFragment onCreateFirstFragment() {

    return (ViewFragment) new TestPresenter(this).getFragment();
  }
}
