package com.gem.timekeeper.data.dto;

import com.google.gson.annotations.SerializedName;

public class DepartmentDTO {

  @SerializedName("id")
  private int mId;
  @SerializedName("code")
  private String mCode;
  @SerializedName("title")
  private String mTitle;
  @SerializedName("manager_id")
  private int mManagerId;

  public int getId() {
    return mId;
  }

  public void setId(int id) {
    this.mId = id;
  }

  public String getCode() {
    return mCode;
  }

  public void setCode(String code) {
    this.mCode = code;
  }

  public String getTitle() {
    return mTitle;
  }

  public void setTitle(String title) {
    this.mTitle = title;
  }

  public int getManagerId() {
    return mManagerId;
  }

  public void setManagerId(int managerId) {
    this.mManagerId = managerId;
  }
}
