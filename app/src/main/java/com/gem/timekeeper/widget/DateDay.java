package com.gem.timekeeper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gem.timekeeper.R;

public class DateDay extends LinearLayout {
  private TextView tvDay;
  private TextView tvDate;

  public DateDay(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init(context, attrs);
  }

  public DateDay(Context context) {
    super(context);
    init(context, null);
  }

  public void init(Context context, @Nullable AttributeSet attrs) {
    LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View view = inflater.inflate(R.layout.view_date_day, this, true);
    tvDate = view.findViewById(R.id.tvDate);
    tvDay = view.findViewById(R.id.tvDay);

    TypedArray input = getContext().obtainStyledAttributes(attrs, R.styleable.DateDay, 0, 0);
    String contentDay = input.getString(R.styleable.DateDay_contentDay);
    tvDay.setText(contentDay);
    String contentDate = input.getString(R.styleable.DateDay_contentDate);
    tvDate.setText(contentDate);
    boolean isWorking=input.getBoolean(R.styleable.DateDay_isWorking,true);
    isWorking(isWorking);
  }

  public void setDay(String day) {
    tvDay.setText(day);
  }

  public String getDay() {
    return tvDay.getText().toString();
  }

  public void setDate(String date) {
    tvDate.setText(date);
  }


  public String getDate() {
    return tvDate.getText().toString();
  }

  public void isWorking(boolean isWork) {
    if (isWork) {
      tvDate.setBackgroundResource(R.color.colorBlue);
      tvDay.setBackgroundResource(R.drawable.bg_day_of_week_normal);
      tvDay.setTextColor(getContext().getResources().getColor(R.color.colorBlue));
    } else {
      tvDate.setBackgroundResource(R.color.colorRedLight);
      tvDay.setBackgroundResource(R.drawable.bg_day_of_week_holiday);
      tvDay.setTextColor(getContext().getResources().getColor(R.color.colorRedLight));
    }

  }
}