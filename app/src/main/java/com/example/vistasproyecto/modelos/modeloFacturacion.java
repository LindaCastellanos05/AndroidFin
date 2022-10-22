package com.example.vistasproyecto.modelos;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//linda
public class modeloFacturacion implements Serializable {

    //nombre en la base de datos
    @SerializedName("id_facturacion")
    @Expose
    private int id_facturacion;
    @SerializedName("cantidad_facturacion")
    @Expose
    private int cantidad_facturacion;
    @SerializedName("monto_facturacion")
    @Expose
    private double monto_facturacion;
    @SerializedName("fecha_facturacion")
    @Expose
    private String fecha_facturacion;
    @SerializedName("nit_facturacion")
    @Expose
    private String nit_facturacion;
    @SerializedName("idcajero_facturacion")
    @Expose
    private modeloUsuario idcajero_facturacion;
    @SerializedName("idcliente_facturacion")
    @Expose
    private modeloCliente idcliente_facturacion;

    public modeloFacturacion() {
    }

    public int getId_facturacion() {
        return id_facturacion;
    }

    public void setId_facturacion(int id_facturacion) {
        this.id_facturacion = id_facturacion;
    }

    public int getCantidad_facturacion() {
        return cantidad_facturacion;
    }

    public void setCantidad_facturacion(int cantidad_facturacion) {
        this.cantidad_facturacion = cantidad_facturacion;
    }

    public double getMonto_facturacion() {
        return monto_facturacion;
    }

    public void setMonto_facturacion(double monto_facturacion) {
        this.monto_facturacion = monto_facturacion;
    }

    public String getFecha_facturacion() {
        return fecha_facturacion;
    }

    public void setFecha_facturacion(String fecha_facturacion) {
        this.fecha_facturacion = fecha_facturacion;
    }

    public String getNit_facturacion() {
        return nit_facturacion;
    }

    public void setNit_facturacion(String nit_facturacion) {
        this.nit_facturacion = nit_facturacion;
    }

    public modeloUsuario getIdcajero_facturacion() {
        return idcajero_facturacion;
    }

    public void setIdcajero_facturacion(modeloUsuario idcajero_facturacion) {
        this.idcajero_facturacion = idcajero_facturacion;
    }

    public modeloCliente getIdcliente_facturacion() {
        return idcliente_facturacion;
    }

    public void setIdcliente_facturacion(modeloCliente idcliente_facturacion) {
        this.idcliente_facturacion = idcliente_facturacion;
    }
}
