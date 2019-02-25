package mx.edu.ittepic.tdam_bdrecycler_arleymagnoliaaquinogarcia;

import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.widget.AlertDialogLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.DialogInterface;
import android.widget.Toast;

/**
 * Created by lenovo on 20/02/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private String[] nombres;
    String [] usuario;
    String [] domicilio;
    String [] telefono;
    private Context contexto;

    public RecyclerAdapter(String[] u,String[] n,String[] d,String[] t, Context con) {
        this.nombres = n;
        this.usuario = u;
        this.domicilio = d;
        this.telefono = t;
        this.contexto = con;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        holder.usuario.setText(usuario[position]);
        holder.nombre.setText(nombres[position]);
        holder.domicilio.setText(domicilio[position]);
        holder.telefono.setText(telefono[position]);

    }

    @Override
    public int getItemCount() {
        return nombres.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView usuario;
        TextView nombre;
        TextView domicilio;
        TextView telefono;

        public RecyclerViewHolder(View itemView) {
            super(itemView);

            usuario = itemView.findViewById(R.id.id);
            nombre = itemView.findViewById(R.id.nombre);
            domicilio = itemView.findViewById(R.id.domicilio);
            telefono = itemView.findViewById(R.id.tel);


        }
    }
}