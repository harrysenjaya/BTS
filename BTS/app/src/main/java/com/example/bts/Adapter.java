package com.example.bts;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.bts.Model.Checklist;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Adapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<Checklist> checklists;

    public Adapter(Activity activity, ArrayList<Checklist> checklists) {
        this.activity = activity;
        this.checklists = checklists;
    }

    @Override
    public int getCount() {
        return checklists.size()+1;
    }

    @Override
    public Object getItem(int i) {
        return  this.checklists.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(this.activity).inflate(R.layout.listview_checklist, viewGroup, false);
        TextView id = view.findViewById(R.id.checklist_id);
        TextView name = view.findViewById(R.id.checklist_name);
        TextView items = view.findViewById(R.id.checklist_items);
        TextView status = view.findViewById(R.id.checklist_status);
        if (i > 0) {
            id.setText(checklists.get(i-1).getId());
            name.setText(checklists.get(i-1).getName());
            items.setText(checklists.get(i-1).getItems());
            status.setText(checklists.get(i-1).getChecklistCompletionStatus());
        }
        return view;
    }
}
