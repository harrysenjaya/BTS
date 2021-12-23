package com.example.bts.Model;

public class Checklist {

    String id;
    String name;
    String items;
    String checklistCompletionStatus;

    public Checklist(String id, String name, String items, String checklistCompletionStatus) {
        this.id = id;
        this.name = name;
        this.items = items;
        this.checklistCompletionStatus = checklistCompletionStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getChecklistCompletionStatus() {
        return checklistCompletionStatus;
    }

    public void setChecklistCompletionStatus(String checklistCompletionStatus) {
        this.checklistCompletionStatus = checklistCompletionStatus;
    }
}
