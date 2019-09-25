package jp.kirin3.junit;

import java.util.List;

public class ListUtils {

    public static StatusResult getActiveAndCompletedStatus(List<Task> tasks){
        if(tasks == null || tasks.isEmpty()){
            return new StatusResult(0f,0f);
        }
        else{
            int totalTasks = tasks.size();
            int numberOfActiveTasks = 0;
            for(int i = 0; i < tasks.size(); i++){
                if(tasks.get(i).isActive()) numberOfActiveTasks++;
            }

            return new StatusResult(
                    100f * numberOfActiveTasks /tasks.size(),
                    100f * (totalTasks - numberOfActiveTasks ) / tasks.size()
            );
        }
    }
}

