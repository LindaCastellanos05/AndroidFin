package com.example.vistasproyecto.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class modeloCliente implements Serializable {
    //nombre en la base de datos
    @SerializedName("id_cliente")
    @Expose
    private int id_cliente;
    @SerializedName("nombre_cliente")
    @Expose
    private String nombre_cliente;
    @SerializedName("apellido_cliente")
    @Expose
    private String apellido_cliente;
    @SerializedName("correo_cliente")
    @Expose
    private String correo_cliente;
    @SerializedName("direccion_cliente")
    @Expose
    private String direccion_cliente;
    @SerializedName("telefono_cliente")
    @Expose
    private String telefono_cliente;
    @SerializedName("dpi_cliente")
    @Expose
    private String dpi_cliente;
    @SerializedName("nit_cliente")
    @Expose
    private String nit_cliente;
    @SerializedName("genero_cliente")
    @Expose
    private modeloGenero genero_cliente;

    public modeloCliente() {
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getDpi_cliente() {
        return dpi_cliente;
    }

    public void setDpi_cliente(String dpi_cliente) {
        this.dpi_cliente = dpi_cliente;
    }

    public String getNit_cliente() {
        return nit_cliente;
    }

    public void setNit_cliente(String nit_cliente) {
        this.nit_cliente = nit_cliente;
    }

    public modeloGenero getGenero_cliente() {
        return genero_cliente;
    }

    public void setGenero_cliente(modeloGenero genero_cliente) {
        this.genero_cliente = genero_cliente;
    }
}
