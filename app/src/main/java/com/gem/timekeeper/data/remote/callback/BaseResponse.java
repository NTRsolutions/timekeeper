package com.gem.timekeeper.data.remote.callback;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

public abstract class BaseResponse {
  @SerializedName("is_error")
  private boolean mIsError;
  @SerializedName("status_code")
  private int mStatusCode;
  @SerializedName("message_code")
  private String mMessageCode;
  @SerializedName("errors")
  private Error mErrors;

  public boolean isError() {
    return mIsError;
  }

  public void setError(boolean error) {
    mIsError = error;
  }

  public int getStatusCode() {
    return mStatusCode;
  }

  public void setStatusCode(int statusCode) {
    this.mStatusCode = statusCode;
  }

  public String getMessageCode() {
    return mMessageCode;
  }

  public void setMessageCode(String messageCode) {
    this.mMessageCode = messageCode;
  }

  public Error getErrors() {
    return mErrors;
  }

  public void setErrors(Error errors) {
    this.mErrors = errors;
  }

  public class Error {
    @SerializedName("first_error")
    private String mFirstError;
    @SerializedName("all")
    private HashMap<String, String> mAll;

    public String getFirstError() {
      return mFirstError;
    }

    public void setFirstError(String firstError) {
      this.mFirstError = firstError;
    }

    public HashMap<String, String> getAll() {
      return mAll;
    }

    public void setAll(HashMap<String, String> all) {
      this.mAll = all;
    }
  }
}