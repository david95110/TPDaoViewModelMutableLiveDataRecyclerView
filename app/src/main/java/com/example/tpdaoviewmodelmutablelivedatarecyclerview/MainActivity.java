package com.example.tpdaoviewmodelmutablelivedatarecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tpdaoviewmodelmutablelivedatarecyclerview.Model.Person;
import com.example.tpdaoviewmodelmutablelivedatarecyclerview.Model.PersonViewModel;
import com.example.tpdaoviewmodelmutablelivedatarecyclerview.controller.DaoPerson;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editName, editFirstname;
    private MyAdapter myAdapter;
    DaoPerson daoPerson;
    private PersonViewModel personViewModel;

    //private List<Person>    personList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daoPerson = new DaoPerson();

        personViewModel = new ViewModelProvider(this).get(PersonViewModel.class);
        myAdapter = new MyAdapter(personViewModel.getmPersons().getValue());

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        button = findViewById(R.id.button_Add);
        button.setOnClickListener(view -> doAdd());

        editName = findViewById(R.id.edit_Name);
        editFirstname = findViewById(R.id.edit_firstName);

    }
    private void doAdd(){
        String name = editName.getText().toString();
        String firtName = editFirstname.getText().toString() ;
        Person person=new Person(name,firtName);
        // appel au controleur
        daoPerson.addPerson(person);
        personViewModel.addPerson(person);
        myAdapter.notifyDataSetChanged();
    }
}