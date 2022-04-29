package com.guercif.comprendrelafranaise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.guercif.comprendrelafranaise.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageButton;
import pl.droidsonroids.gif.GifImageView;

public class Adapter  extends ArrayAdapter<Data> {
   public Adapter(@NonNull Context context, ArrayList<Data> data){
       super(context,0,data);
   }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View listItemView  = convertView;
       if(listItemView ==null)
           listItemView  = LayoutInflater.from(getContext()).inflate(R.layout.test,parent,false);

       Data mydata = getItem(position);
        GifImageView consonne = listItemView.findViewById(R.id.letter_conson_gif);
        GifImageView voyelle = listItemView.findViewById(R.id.letter_voyel_gif);
        TextView name = listItemView.findViewById(R.id.letter_base);
        consonne.setImageResource(mydata.getLetter_consonne_ID());
        voyelle.setImageResource(mydata.getLetter_voyelle_ID());
        name.setText(mydata.getName());
       return listItemView;
    }
}
