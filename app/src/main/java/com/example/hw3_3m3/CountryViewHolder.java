package com.example.hw3_3m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCountry;
    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void onBind(String country){
        tvCountry.setText(country);
    }
}
