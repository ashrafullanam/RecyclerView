package com.example.ashraf.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Trainer on 8/29/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private Context context;
    private ArrayList<PhoneContact>contacts;

    public ContactAdapter(Context context, ArrayList<PhoneContact> contacts) {
        this.context = context;
        this.contacts = contacts;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.contact_row,parent,false);
        return new ContactViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.nameTV.setText(contacts.get(position).getContactName());
        holder.phoneTV.setText(contacts.get(position).getContactNumber());
        holder.contactIV.setImageResource(contacts.get(position).getContactImage());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{

        ImageView contactIV;
        TextView nameTV;
        TextView phoneTV;

        public ContactViewHolder(View itemView) {
            super(itemView);

            contactIV = (ImageView) itemView.findViewById(R.id.pic);
            nameTV = (TextView) itemView.findViewById(R.id.name);
            phoneTV = (TextView) itemView.findViewById(R.id.contact);

        }
    }

}
