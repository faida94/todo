package io.jumpco.demo.todo.controller;

import io.jumpco.demo.todo.model.EntityNotFoundException;
import io.jumpco.demo.todo.model.Todo;
import io.jumpco.demo.todo.model.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


@Controller
public class TodoController<Map> {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/todo/create")
    public ModelAndView startCreate() {
        ModelAndView result = new ModelAndView("add-edit");
        result.addObject("mode", "add");
        result.addObject("modeTitle", "Create");
        result.addObject("todo", new Todo());
        result.addObject("todoType","type");
        return result;
    }

    @GetMapping("/todo/edit/{id}")
    public ModelAndView startEdit(@PathVariable("id") Long id) throws EntityNotFoundException {
        Todo item = todoService.find(id);
        ModelAndView result = new ModelAndView("add-edit");
        result.addObject("mode", "update");
        result.addObject("modeTitle", "Update");
        result.addObject("todo", item);
        return result;
    }

    @PostMapping(params = "cancel", path = "/todo/add")
    public String cancelAdd() {
        return home();
    }

    @PostMapping(params = "cancel", path = "/todo/update")
    public String cancelUpdate() {
        return home();
    }

    @PostMapping("/todo/update")
    public ModelAndView update(@Valid @ModelAttribute Todo todo, BindingResult bindingResult, Model model) throws EntityNotFoundException {
        if (bindingResult.hasErrors()) {
            ModelAndView result = new ModelAndView("add-edit");
            result.addObject("mode", "update");
            result.addObject("modeTitle", "Update");
            result.addAllObjects(model.asMap());
            return result;
        }
        todoService.update(todo);
        return new ModelAndView(home());
    }

    @PostMapping("/todo/add")
    public ModelAndView create(@Valid @ModelAttribute Todo todo, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            ModelAndView result = new ModelAndView("add-edit");
            result.addObject("mode", "add");
            result.addObject("modeTitle", "Create");
            result.addAllObjects(model.asMap());
            return result;
        }
        todoService.create(todo);
        return new ModelAndView(home());
    }

    @GetMapping(value = "/todo/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        todoService.delete(id);
        return home();
    }

    @GetMapping(value = "/todo/complete/{id}")
    public String complete(@PathVariable("id") Long id) throws EntityNotFoundException {
        todoService.complete(id);
        return home();
    }

    private String home() {
        return "redirect:/";
    }

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView result = new ModelAndView("index");
        result.addObject("todos", todoService.list(null));
        return result;
    }
    protected Map referenceData(HttpServletRequest request) {
        Map referenceData = (Map) new HashMap();

        java.util.Map<String, String> type = new LinkedHashMap<String, String>();
        type.put("TASK","Task");
        type.put("BUG","Bug");
        type.put("FEATURES", "Features");
        type.put("ENHANCEMENT", "Enhancement");
        type.put("MAINTENANCE", "Maintenance");
        //referenceData.getClass("TodoType", type);
        return (Map) type;
    }
    }
