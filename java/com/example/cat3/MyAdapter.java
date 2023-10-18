package com.example.cat3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context context;
    private List<DataClass> dataList;

    public void setSearchList(List<DataClass> dataSearchList){
        this.dataList = dataSearchList;
        notifyDataSetChanged();
    }

    public MyAdapter(Context context, List<DataClass> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.recTitle.setText(dataList.get(position).getDataTitle());
        holder.recDate.setText(dataList.get(position).getDataDate());

        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Title", dataList.get(holder.getAdapterPosition()).getDataTitle());
                intent.putExtra("Desc", dataList.get(holder.getAdapterPosition()).getDataDesc());
                intent.putExtra("Date", dataList.get(holder.getAdapterPosition()).getDataDate()); // Include the Date value
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }

}

class MyViewHolder extends RecyclerView.ViewHolder{

    TextView recTitle, recDesc, recDate;
    CardView recCard;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        recTitle = itemView.findViewById(R.id.recTitle);
        recDesc = itemView.findViewById(R.id.recDesc);
        recDate = itemView.findViewById(R.id.recDate);
        recCard = itemView.findViewById(R.id.recCard);
    }
}