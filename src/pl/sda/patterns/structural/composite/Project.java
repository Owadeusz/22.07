package pl.sda.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Project implements Viewable {
   private String title;
   private List<Todo> todos = new ArrayList<>();

    public Project(String title) {
        this.title = title;
    }
    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    @Override
    public String getContent() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<ul>");
        stringBuilder.append(title);
        for (Todo todo : todos) {
            stringBuilder.append("<li>");
            stringBuilder.append(todo.getContent());
            stringBuilder.append("</li>");
        }
        stringBuilder.append("</ul>");
        return stringBuilder.toString();
    }
}
