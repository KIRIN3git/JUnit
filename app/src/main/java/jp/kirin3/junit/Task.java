package jp.kirin3.junit;

public class Task {

    String title;
    String description;
    Boolean isCompleted;
    String id;

    public Task(String title,String description,Boolean isCompleted,String id){
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
        this.id = id;
    }

    public boolean isActive(){
        if(!isCompleted) return true;
        else return false;
    }
}
