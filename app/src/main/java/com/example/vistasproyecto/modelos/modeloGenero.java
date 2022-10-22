package com.example.vistasproyecto.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class modeloGenero implements Serializable {
    @SerializedName("id_genero")
    @Expose
    private int id_genero;
    @SerializedName("descripcion_genero")
    @Expose
    private String descripcion_genero;

    public modeloGenero() {
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getDescripcion_genero() {
        return descripcion_genero;
    }

    public void setDescripcion_genero(String descripcion_genero) {
        this.descripcion_genero = descripcion_genero;
    }
}
