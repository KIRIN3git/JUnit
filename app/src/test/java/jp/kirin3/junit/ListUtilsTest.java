package jp.kirin3.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListUtilsTest {

    @Test
    public void getActiveAndCompletedStatus() {
        List<Task> tasks = Arrays.asList(
                new Task("title1","description1",true,"id1"),
                new Task("title2","description2",false,"id2"),
                new Task("title3","description3",false,"id3")
        );
    }
}