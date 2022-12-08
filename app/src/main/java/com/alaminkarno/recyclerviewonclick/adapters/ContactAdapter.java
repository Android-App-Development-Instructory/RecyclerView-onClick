package com.alaminkarno.recyclerviewonclick.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alaminkarno.recyclerviewonclick.R;
import com.alaminkarno.recyclerviewonclick.activity.ContactDetailsActivity;
import com.alaminkarno.recyclerviewonclick.models.Contact;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {


    private List<Contact> contacts;
    private Context context;

    public ContactAdapter(List<Contact> contacts,Context context) {
        this.contacts = contacts;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_design_contact,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {

        Contact contact = contacts.get(position);

        holder.contactNameTV.setText(contact.getName());
        holder.contactImageView.setImageResource(contact.getImage());

        holder.contactCallIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Calling...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+contact.getPhone()));
                context.startActivity(intent);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, ContactDetailsActivity.class);

                intent.putExtra("name",contact.getName());
                intent.putExtra("phone",contact.getPhone());
                intent.putExtra("image",contact.getImage());

                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView contactImageView,contactCallIV;
        private TextView contactNameTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contactImageView = itemView.findViewById(R.id.contactImageView);
            contactCallIV = itemView.findViewById(R.id.contactCallIV);
            contactNameTV = itemView.findViewById(R.id.contactNameTV);


        }
    }
}
