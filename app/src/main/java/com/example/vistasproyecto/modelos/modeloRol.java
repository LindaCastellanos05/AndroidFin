package com.example.vistasproyecto.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class modeloRol implements Serializable {
    @SerializedName("id_rol")
    @Expose
    private int id_rol;
    @SerializedName("descripcion_rol")
    @Expose
    private String descripcion_rol;

    public modeloRol() {
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getDescripcion_rol() {
        return descripcion_rol;
    }

    public void setDescripcion_rol(String descripcion_rol) {
        this.descripcion_rol = descripcion_rol;
    }
}
