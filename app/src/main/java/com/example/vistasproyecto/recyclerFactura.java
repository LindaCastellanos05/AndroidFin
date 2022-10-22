package com.example.vistasproyecto;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.vistasproyecto.adaptadores.ReciclerFacturaAdapter;
import com.example.vistasproyecto.modelos.modeloFacturacion;
import com.example.vistasproyecto.utils.Apis;
import com.example.vistasproyecto.utils.FacturaServices;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//linda
public class recyclerFactura extends AppCompatActivity {
//declaracion
    private RecyclerView rv;
    private List<modeloFacturacion> lista;
    private ReciclerFacturaAdapter adaptador;

    FacturaServices facservices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_factura);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Ver Facturas");

        rv = findViewById(R.id.rvfactura);

        layout();
    }

    private void layout(){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
        facservices= Apis.getFacturaService();
        Call<List<modeloFacturacion>> call= facservices.getFacturas();
        call.enqueue(new Callback<List<modeloFacturacion>>() {
            @Override
            public void onResponse(Call<List<modeloFacturacion>> call, Response<List<modeloFacturacion>> response) {
                if(response.isSuccessful()){
                    lista=response.body();



                    System.out.println(lista);
                    adaptador = new ReciclerFacturaAdapter(lista);
                    rv.setAdapter(adaptador);

                }
            }

            @Override
            public void onFailure(Call<List<modeloFacturacion>> call, Throwable t) {

                System.out.println("a");
                Log.e("Error", t.getMessage());
                System.out.println("a");


            }
        });

    }
}