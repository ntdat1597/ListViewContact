package com.example.listviewcontact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private List<ContactModel> listContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView) findViewById(R.id.lbContact);
        ContactAdapter adapter = new ContactAdapter(listContacts, this);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ContactModel contactModel = listContacts.get(position);
                Toast.makeText(MainActivity.this, contactModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }





    private void initData() {
        ContactModel contactModel = new ContactModel("Nguyen Van X","124322141",R.drawable.danhba);
        listContacts.add(contactModel);
        contactModel = new ContactModel("Nguyen Van C","124213342",R.drawable.danhba);
        listContacts.add(contactModel);
        contactModel = new ContactModel("Nguyen Van C","124213342",R.drawable.danhba);
        listContacts.add(contactModel);
        contactModel = new ContactModel("Nguyen Van C","124213342",R.drawable.danhba);
        listContacts.add(contactModel);
        contactModel = new ContactModel("Nguyen Van C","124213342",R.drawable.danhba);
        listContacts.add(contactModel);
        contactModel = new ContactModel("Nguyen Van C","124213342",R.drawable.danhba);
        listContacts.add(contactModel);


    }
    }