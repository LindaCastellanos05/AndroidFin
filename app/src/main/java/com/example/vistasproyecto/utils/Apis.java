package com.example.vistasproyecto.utils;

public class Apis {


    public static final String URL_001="http://192.168.1.39:8080/Factura/";



    public static FacturaServices getFacturaService(){
        return cliente.getCliente(URL_001).create(FacturaServices.class);
    }
}
