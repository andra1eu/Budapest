package com.example.andralung.budapest.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andralung.budapest.R;
import com.example.andralung.budapest.model.InterestItem;

import java.util.ArrayList;

public class InterestItemAdapter extends ArrayAdapter<InterestItem> {
    public InterestItemAdapter(@NonNull Context context, ArrayList<InterestItem> interestItems) {
        super(context, 0, interestItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        InterestItem item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.interest_item, parent, false);
        }

        ImageView icon = (ImageView) convertView.findViewById(R.id.icon);
        TextView textView = (TextView)convertView.findViewById(R.id.interest_section);

        icon.setImageResource(item.getInterestIcon());
        textView.setText(item.getInterestSection());

        return convertView;
    }
}
