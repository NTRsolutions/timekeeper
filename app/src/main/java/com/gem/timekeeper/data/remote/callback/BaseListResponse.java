package com.gem.timekeeper.data.remote.callback;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class BaseListResponse<T> {
  @SerializedName("data")
  private Data mData;

  public Data getData() {
    return mData;
  }

  public void setData(Data data) {
    this.mData = data;
  }

  public class Data {
    @SerializedName("list")
    private ArrayList<T> mList;
    @SerializedName("paging")
    private Page mPaging;

    public ArrayList<T> getList() {
      return mList;
    }

    public void setList(ArrayList<T> list) {
      this.mList = list;
    }

    public Page getPaging() {
      return mPaging;
    }

    public void setPaging(Page paging) {
      this.mPaging = paging;
    }

    public class Page {
      @SerializedName("total_item")
      private int mTotalItem;
      @SerializedName("per_page")
      private int mPerPage;
      @SerializedName("current_page")
      private int mCurrentPage;
      @SerializedName("total_pages")
      private int mTotalPages;

      public int getTotalItem() {
        return mTotalItem;
      }

      public void setTotalItem(int totalItem) {
        this.mTotalItem = totalItem;
      }

      public int getPerPage() {
        return mPerPage;
      }

      public void setPerPage(int perPage) {
        this.mPerPage = perPage;
      }

      public int getCurrentPage() {
        return mCurrentPage;
      }

      public void setCurrentPage(int currentPage) {
        this.mCurrentPage = currentPage;
      }

      public int getTotalPages() {
        return mTotalPages;
      }

      public void setTotalPages(int totalPages) {
        this.mTotalPages = totalPages;
      }
    }
  }
}