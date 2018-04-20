package com.example.praba.twoplans;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SubAdapterPantai extends RecyclerView.Adapter<SubAdapterPantai.ViewHolder>{
    private static final String TAG = "SubAdapterPantai";

    String namaPantai [] = {"Pantai Sanur","Pantai Pandawa","Pantai Bias Tugel","Pantai Dreamland","Pantai Angel Billabong"};
    int pantai [] = {R.drawable.pantaisanur,
            R.drawable.pantaipandawa,
            R.drawable.pantaibiastugel,
            R.drawable.pantaidreamland,
            R.drawable.pantaiangelbillabong};
    String detail [] = {"des 1",
            "des 2",
            "des 3",
            "des 4",
            "des 5"};

    Context mContext;
    LayoutInflater layoutInflater;

    public SubAdapterPantai(Context mContext) {
        this.mContext = mContext;
        layoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_list,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.txt.setText(namaPantai[position]);
        holder.img.setImageResource(pantai[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kirimData = new Intent(mContext,DetailActivity.class);
                kirimData.putExtra("Nama",namaPantai[position]);
                kirimData.putExtra("img",pantai[position]);
                kirimData.putExtra("Detail",detail[position]);
                mContext.startActivity(kirimData);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaPantai.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        TextView txtDes;
        public ViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imgView);
            txt = (TextView) itemView.findViewById(R.id.txtView);
            txtDes = (TextView) itemView.findViewById(R.id.txtDetail);
        }
    }
}
