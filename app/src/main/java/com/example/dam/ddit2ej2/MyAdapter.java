package com.example.dam.ddit2ej2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder>{

    String[] myArray;


    public MyAdapter(String[] array1) {

        this.myArray = array1;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //false: solo lo infla, no lo pone por pantalla
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row,
                viewGroup, false);

        return (new MyViewHolder(itemView));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.miView.setText(myArray[i]);

        Log.d("longitud bind", String.valueOf(i));
    }

    @Override
    public int getItemCount() {

        Log.d("longitud count", String.valueOf(myArray.length));

        return myArray.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView miView;

        public MyViewHolder(@NonNull View itemView){

            super(itemView);

            //Extrae cada uno de los elementos que tenemos y le da un nombre.

            miView = (TextView) itemView.findViewById(R.id.textVAnimada);

        }
    }

}
