package com.gem.timekeeper.data.dto;

import com.google.gson.annotations.SerializedName;

public class TimeTrackDTO {
  @SerializedName("id")
  private int mId;
  @SerializedName("date")
  private int mDate;

  @SerializedName("time_in")
  private int mTimeIn;
  @SerializedName("time_out")
  private int mTimeOut;
  @SerializedName("wage")
  private float mWage;
  @SerializedName("leave_wage")
  private float mLeaveWage;
  @SerializedName("is_approved")
  private int mIsApproved;
  @SerializedName("check_type")
  private String mCheckType;
  @SerializedName("manager_note")
  private String mManagerNote;
}
