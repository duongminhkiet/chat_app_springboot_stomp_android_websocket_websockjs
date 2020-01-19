package com.example.socketstomp;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import retrofit2.http.POST;
import retrofit2.http.Query;
public interface ExampleRepository {

    @POST("hello-convert-and-send")
    Completable sendRestEcho(@Query("msg") String message);
}

