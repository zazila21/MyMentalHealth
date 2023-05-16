package com.owle.mymentalhealth.api;

import com.owle.mymentalhealth.model.ResponseBerita;
import com.owle.mymentalhealth.model.ResponseSubKategori;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiRequest {

    @GET("api/sub-kategori")
    Call<ResponseSubKategori> allSubKategori();

    @GET("api/berita/{id_sub_kategori}")
    Call<ResponseBerita> showBeritaSubKategori(@Path("id_sub_kategori") String id_sub_kategori);

}
