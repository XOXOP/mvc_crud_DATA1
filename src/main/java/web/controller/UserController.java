package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;
import web.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import web.model.User;
import web.service.UserService;


import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

//	@GetMapping(value = "/")
//	public String printWelcome(ModelMap model) {
//		List<String> messages = new ArrayList<>();
//		messages.add("Hello!");
//		messages.add("I'm Spring MVC application");
//		messages.add("5.2.0 version by sep'19 ");
//		model.addAttribute("messages", messages);
//		return "index";
//	}
@Autowired
private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/")
	public String showAllUsers(ModelMap modelUser) {
		modelUser.addAttribute("userList", userService.getUsers());
		return "users";
	}
	@RequestMapping(value = "/addNewUser")
	public String addNewUser(ModelMap modelUser) {
		User addUser = new User();
		modelUser.addAttribute("userList", addUser);
		return "addUser";
	}
	@RequestMapping(value = "/saveUser")
	public String saveUser(@ModelAttribute("userList") User userSave) {
		userService.saveUser(userSave);
		return "redirect:/";
	}

	@RequestMapping(value = "/{id}/deleteUser")
	public String deleteUser(@PathVariable("id") Long idDelete) {
		userService.deleteUser(idDelete);
		return "redirect:/";
	}
	@RequestMapping(value = "/{id}/editUser")
	public String editUser(Model modelUser, @PathVariable("id") Long idEdit) {
		modelUser.addAttribute("userList", userService.findUser(idEdit));
		return "editUser";
	}
	@RequestMapping(value = "/{id}/updateUser")
	public String updateUser(@ModelAttribute("userList") User userUpdate, @PathVariable("id") Long idUpdate) {
		userService.updateUser(userUpdate);
		return "redirect:/";
	}


}