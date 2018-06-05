package com.gem.timekeeper.data.dto;

import com.google.gson.annotations.SerializedName;

public class ForgetRequestDTO {
    private int mId;
    private String mType;
    private String mStatus;
    private String mNote;
    private String mMnagerNote;


    @SerializedName("created_at")
    private int mCreatedAt;
    @SerializedName("updated_at")
    private int mUpdateAt;
}
