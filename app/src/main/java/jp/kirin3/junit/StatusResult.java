package jp.kirin3.junit;

public class StatusResult {

    float activeTasksPercent;
    float completedTasksPercent;

    public StatusResult(float activeTasksPercent, float completedTasksPercent){

        this.activeTasksPercent = activeTasksPercent;
        this.completedTasksPercent = completedTasksPercent;

    }
}
