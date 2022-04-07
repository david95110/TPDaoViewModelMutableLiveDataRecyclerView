package com.example.tpdaoviewmodelmutablelivedatarecyclerview.Model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class PersonViewModel extends ViewModel {
    private MutableLiveData<List<Person>> mPersons;

    public MutableLiveData<List<Person>> getmPersons(){
        if(mPersons == null){
            mPersons = new MutableLiveData<>();
            mPersons.setValue(new ArrayList<>());
        }
        return mPersons;
    }

    public void addPerson(Person person){
        this.mPersons.getValue().add(person);
        this.mPersons.setValue(this.mPersons.getValue());
        // mPersons.setValue(list);

    }

}
