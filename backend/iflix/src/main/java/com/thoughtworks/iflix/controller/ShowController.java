package com.thoughtworks.iflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.iflix.dto.UserLoginDto;
import com.thoughtworks.iflix.model.Show;
import com.thoughtworks.iflix.model.User;
import com.thoughtworks.iflix.service.ShowService;
import com.thoughtworks.iflix.service.UserService;

@RestController
@RequestMapping("/iflix")
public class ShowController 
{
	@Autowired
	ShowService showService;
	
	@PostMapping("/createShow")
	public boolean createShow(@RequestBody Show newShow) 
	{
		return showService.createNewShow(newShow);
	}
	
	@PostMapping("/showlist")
	public List<Show> showList() 
	{
		return showService.getshowList();
	}
}
