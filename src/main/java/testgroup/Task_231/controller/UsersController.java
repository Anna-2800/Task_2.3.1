package testgroup.Task_231.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import testgroup.Task_231.model.User;
import testgroup.Task_231.service.UserService;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    public String allUsers(Model model){
        model.addAttribute("users", userService.allUsers());
        return "users/allUsers";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.getById(id));
        return "users/show";
    }

    @GetMapping("/new")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "users/new";
    }

    @PostMapping
    public String create(@ModelAttribute("user") User user){
        userService.add(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String editPage(Model model, @PathVariable("id") int id){
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "users/edit";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String editUser(@ModelAttribute("user") User user){
        userService.edit(user);
        return "redirect:/users";
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") int id) {
        userService.delete(userService.getById(id));
        System.out.println("sdv");
        return "redirect:/users";
    }

}
