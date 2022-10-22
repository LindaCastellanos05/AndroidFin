package com.example.vistasproyecto.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vistasproyecto.R;
import com.example.vistasproyecto.modelos.modeloFacturacion;

import java.io.Serializable;
import java.util.List;

//linda
public class ReciclerFacturaAdapter extends RecyclerView.Adapter<ReciclerFacturaAdapter.RecyclerHolder> {
    private List<modeloFacturacion> items;



    public ReciclerFacturaAdapter(List<modeloFacturacion> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ReciclerFacturaAdapter.RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tarjeta_factura, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReciclerFacturaAdapter.RecyclerHolder holder, int position) {
        modeloFacturacion mfac = items.get(position);
        holder.txtid.setText(String.format("ID: %d", mfac.getId_facturacion()));
        holder.txtcantidad.setText(String.format("CANTIDAD: %s", mfac.getCantidad_facturacion()));
        holder.txtmonto.setText(String.format("MONTO: %s", mfac.getMonto_facturacion()));
        holder.txtfecha.setText(String.format("FECHA: %s", mfac.getFecha_facturacion()));
        holder.txtnit.setText(String.format("NIT: %s", mfac.getNit_facturacion()));
        holder.txtidcajero.setText(String.format("ID CAJERO: %s", mfac.getIdcajero_facturacion().getId_usuario()));
       holder.txtidcliente.setText(String.format("ID CLIENTE: %s", mfac.getIdcliente_facturacion().getId_cliente()));


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder{
        private TextView txtid,txtcantidad, txtmonto, txtnit, txtidcajero, txtfecha, txtidcliente;
        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            txtid=itemView.findViewById(R.id.lblidFactura);
            txtcantidad=itemView.findViewById(R.id.lblcantidadfac);
            txtmonto=itemView.findViewById(R.id.lblmontofac);
            txtnit=itemView.findViewById(R.id.lblnitfac);
            txtidcajero=itemView.findViewById(R.id.lblidcajerofac);
            txtidcliente=itemView.findViewById(R.id.lblidclientefac);
            txtfecha=itemView.findViewById(R.id.lblfechafac);

        }

    }
}
