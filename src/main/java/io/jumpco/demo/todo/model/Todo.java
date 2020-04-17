package io.jumpco.demo.todo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.StringJoiner;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Column(name = "title")
    @Size(min = 3, max = 64)
    private String title;
    @NotNull
    @Size(min = 3, max = 255)
    @Column(name = "description")
    private String description;
    @Column(name = "completed", columnDefinition = "boolean default false")
    @NotNull
    private boolean completed = false;
    @Column(name = "order", columnDefinition = "integer default 0")
    @NotNull
    private int order = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Todo todo = (Todo) o;

        if (id != null ? !id.equals(todo.id) : todo.id != null) return false;
        return title != null ? title.equals(todo.title) : todo.title == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Todo.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("description='" + description + "'")
                .add("completed=" + completed)
                .add("order=" + order)
                .toString();
    }

    public enum TodoType {
        id("id"),
        Task("Task"),
        Bug("Bug"),
        Features("Features"),
        Maintenance("Maintenance"),
        Ready("Ready"),
        In_Progress("In_Progress"),
        Done("Done"),
        Enhancement("Enhancement");

        private TodoType todo_type;

        @Entity
        public class management{
            @Id
            @GeneratedValue
            private int id;
            private String Task;
            private String Bug;
            private String Features;
            private String Maintenance;
            private String Ready;
            private String In_Progress;
            private String Done;
            private String Enhancement;

            @Enumerated(EnumType.STRING)
            private TodoType todo_type;
        }
        public void todo_manage(){

        }
        
        private String management;

        TodoType(String management) {
            this.management = management;
        }

        public String getManagement() {
            return management;
        }

         public TodoType getTodo_type() {

             return todo_type;
         }

         public void setTodo_type(TodoType todo_type) {

             this.todo_type = todo_type;
         }



        }
    }


