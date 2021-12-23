package com.example.bts;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bts.Model.Checklist;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChecklistActivity extends AppCompatActivity {

    private ListView listView;
    private EditText name;
    private Button save;
    private EditText id;
    private Button delete;

    private ArrayList<Checklist> checklists;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);

        listView = this.findViewById(R.id.listview);
        name = this.findViewById(R.id.checklist_name);
        save = this.findViewById(R.id.checklist_save);
        id = this.findViewById(R.id.checklist_id);
        delete = this.findViewById(R.id.checklist_delete);

//        MutableLiveData<Checklist> data =

        Call<Checklist> checklistCall = new NetworkUtil().getApi().getChecklist(Constant.TOKEN);
        checklistCall.enqueue(new Callback<Checklist>() {
                                  @Override
                                  public void onResponse(Call<Checklist> call, Response<Checklist> response) {
                                    if(response.isSuccessful()){
//                                        for (Checklist var: response.body()) {
//
//                                        }(response.body()){
//
//                                        }
//                                        adapter = new Adapter(this,)
                                    }
                                  }

                                  @Override
                                  public void onFailure(Call<Checklist> call, Throwable t) {

                                  }
                              });



    }
}
