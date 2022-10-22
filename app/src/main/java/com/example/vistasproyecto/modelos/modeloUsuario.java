package com.example.vistasproyecto.modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class modeloUsuario implements Serializable {
    //nombre en la base de datos
    @SerializedName("id_usuario")
    @Expose
    private int id_usuario;
    @SerializedName("nombre_usuario")
    @Expose
    private String nombre_usuario;
    @SerializedName("Apellido_usuario")
    @Expose
    private String apellido_usuario;
    @SerializedName("dpi_usuario")
    @Expose
    private String dpi_usuario;
    @SerializedName("direccion_usuario")
    @Expose
    private String direccion_usuario;
    @SerializedName("fechanac_usuario")
    @Expose
    private String fechanac_usuario;
    @SerializedName("idtipo_usuario")
    @Expose
    private modeloRol idtipo_usuario;
    @SerializedName("user_usuario")
    @Expose
    private String user_usuario;
    @SerializedName("pwd_usuario")
    @Expose
    private String pwd_usuario;
    @SerializedName("genero_usuario")
    @Expose
    private modeloGenero genero_usuario;
    @SerializedName("correo_usuario")
    @Expose
    private String correo_usuario;
    @SerializedName("telefono_usuario")
    @Expose
    private String telefono_usuario;

    public modeloUsuario() {
    }

    public modeloGenero getGenero_usuario() {
        return genero_usuario;
    }

    public void setGenero_usuario(modeloGenero genero_usuario) {
        this.genero_usuario = genero_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getDpi_usuario() {
        return dpi_usuario;
    }

    public void setDpi_usuario(String dpi_usuario) {
        this.dpi_usuario = dpi_usuario;
    }

    public String getDireccion_usuario() {
        return direccion_usuario;
    }

    public void setDireccion_usuario(String direccion_usuario) {
        this.direccion_usuario = direccion_usuario;
    }

    public String getFechanac_usuario() {
        return fechanac_usuario;
    }

    public void setFechanac_usuario(String fechanac_usuario) {
        this.fechanac_usuario = fechanac_usuario;
    }

    public modeloRol getIdtipo_usuario() {
        return idtipo_usuario;
    }

    public void setIdtipo_usuario(modeloRol idtipo_usuario) {
        this.idtipo_usuario = idtipo_usuario;
    }

    public String getUser_usuario() {
        return user_usuario;
    }

    public void setUser_usuario(String user_usuario) {
        this.user_usuario = user_usuario;
    }

    public String getPwd_usuario() {
        return pwd_usuario;
    }

    public void setPwd_usuario(String pwd_usuario) {
        this.pwd_usuario = pwd_usuario;
    }
}


