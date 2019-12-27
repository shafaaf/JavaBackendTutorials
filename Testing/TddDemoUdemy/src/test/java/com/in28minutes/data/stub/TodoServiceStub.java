package com.in28minutes.data.stub;

import com.in28minutes.data.api.TodoService;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList (
                "Learn Spring MVC",
                "Learn Spring",
                "Learn to Dance"
        );
    }

    @Override
    public void deleteTodo(String todo) {

    }
}
