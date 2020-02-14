package com.example.tehtava6;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class adapteri  extends ArrayAdapter<MyEntity>{

    private  Context context;
    ArrayList <MyEntity> dataset;


    public adapteri(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        this.context = context;
        this.dataset = (ArrayList<MyEntity>)objects;



    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.omalayout,parent,false);
        LinearLayout linearLayout = (LinearLayout) v;

        TextView teksti1 = v.findViewById(R.id.teksti1);
        TextView teksti2= v.findViewById(R.id.teksti2);
        TextView teksti3= v.findViewById(R.id.teksti3);
        Button nappula2 = v.findViewById(R.id.nappula2);
        teksti1.setText(String.valueOf(dataset.get(position).id));
        teksti2.setText(dataset.get(position).tieto);
        teksti3.setText(dataset.get(position).aika);

        nappula2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dataset.remove(position);//poistaa vain myentitiystä ei poista tietokannasta.
                notifyDataSetChanged();

            }
        });


        return v;
    }
}
