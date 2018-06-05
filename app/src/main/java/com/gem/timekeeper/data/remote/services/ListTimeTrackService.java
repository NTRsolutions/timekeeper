package com.gem.timekeeper.data.remote.services;

import com.gem.timekeeper.data.dto.TimeTrackDTO;
import com.gem.timekeeper.data.remote.callback.BaseListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ListTimeTrackService {
  @GET(ApiConfig.END_POINT_TIME_TRACK)
  Call<BaseListResponse<TimeTrackDTO>> getListTimeTrack(@Header("Authorization") String token);

  @GET(ApiConfig.END_POINT_TIME_TRACK)
  Call<BaseListResponse<TimeTrackDTO>> getListTimeTrack(@Header("Authorization") String token, @Query("page") int page,@Query("per_page") int perPage,@Query("month") int mont,@Query("year") int year);
}
