package com.marwadi.myapplicationmca;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ex_recyclerview_videoview extends AppCompatActivity {

    VideoView v;
    String[] data = {"Video 1","Video 2","Video 3","Video 4","Video 5","Video 6","Video 7","Video 8","Video 9","Video 10",
            "Video 1","Video 2","Video 3","Video 4","Video 5","Video 6","Video 7","Video 8","Video 9","Video 10",
            "Video 1","Video 2","Video 3","Video 4","Video 5","Video 6","Video 7","Video 8","Video 9","Video 10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ex_recyclerview_videoview);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ex_recyclerview_videoview.SimpleAdapter());

        v = findViewById(R.id.videoview);
    }
    //Simple Adapter

    class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,parent,false);
            return new ex_recyclerview_videoview.SimpleAdapter.ViewHolder(view);

        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.textView.setText(data[position]);
        }

        @Override
        public int getItemCount() {
            return data.length;
        }

        class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            TextView textView;

            ViewHolder(View itemView){
                super(itemView);
                textView = itemView.findViewById(android.R.id.text1);
                itemView.setOnClickListener(this); // IMPORTANT
            }

            @Override
            public void onClick(View view){
                int position = getAdapterPosition();

                Intent i = new Intent(view.getContext(), ex_recyclerview_videoview1.class);
                i.putExtra("video_index", position); // send clicked item position
                view.getContext().startActivity(i);
            }
        }
    }


}
