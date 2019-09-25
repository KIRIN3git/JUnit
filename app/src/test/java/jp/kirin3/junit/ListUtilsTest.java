package jp.kirin3.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ListUtilsTest {

    @Test
    public void getActiveAndCompletedStatus_both() {
        List<Task> tasks = Arrays.asList(
                new Task("title1","description1",true,"id1"),
                new Task("title2","description2",false,"id2"),
                new Task("title3","description3",false,"id3"),
                new Task("title4","description4",true,"id4"),
                new Task("title5","description5",true,"id5")
        );

        StatusResult result = ListUtils.getActiveAndCompletedStatus(tasks);

        assertThat(result.activeTasksPercent, is(40f));
        assertThat(result.completedTasksPercent, is(60f));
    }
}