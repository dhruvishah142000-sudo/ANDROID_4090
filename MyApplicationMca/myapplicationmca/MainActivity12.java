//RecyclerView

package com.marwadi.myapplicationmca;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;

public class MainActivity12 extends AppCompatActivity {

    String[] data = {"Apple", "Banana", "Mango", "Orange", "Grapes", "Apple",
            "Banana", "Mango", "Orange", "Grapes", "Apple", "Banana", "Mango",
            "Orange", "Grapes", "Apple", "Banana", "Mango", "Orange", "Grapes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SimpleAdapter());
    }
        //Simple Adapter

        class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder>{

            @NonNull
            @Override
            public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,parent,false);
                return new ViewHolder(view);
            }

            @Override
            public void onBindViewHolder(ViewHolder holder, int position) {
                holder.textView.setText(data[position]);
            }

            @Override
            public int getItemCount() {
                return data.length;
            }

             class ViewHolder extends RecyclerView.ViewHolder{
                TextView textView;

                ViewHolder(View itemView){
                    super(itemView);
                    textView = itemView.findViewById(android.R.id.text1);
                }
            }
        }


    }
