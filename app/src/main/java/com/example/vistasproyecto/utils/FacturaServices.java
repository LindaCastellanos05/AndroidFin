package com.example.vistasproyecto.utils;

import com.example.vistasproyecto.modelos.modeloFacturacion;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FacturaServices {

    @GET("listatodos")
    Call<List<modeloFacturacion>> getFacturas();

}
