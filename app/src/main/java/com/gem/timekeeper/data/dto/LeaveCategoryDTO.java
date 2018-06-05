package com.gem.timekeeper.data.dto;

import com.google.gson.annotations.SerializedName;

public class LeaveCategoryDTO {
    @SerializedName("id")
    private int mId;
    @SerializedName("type")
    private String mType;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("created_at")
    private int mCreatedAt;
    @SerializedName("updated_at")
    private int mUpdateAt;
}
