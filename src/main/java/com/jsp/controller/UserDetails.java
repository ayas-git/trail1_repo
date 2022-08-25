package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserDetails {
	@RequestMapping("/")
 public void showDetails(HttpServletRequest req, HttpServletResponse resp) {

 String name = req.getParameter("name");
 String email =req.getParameter("email");
 String phone=req.getParameter("phone");
 
 try {
 PrintWriter out=resp.getWriter();
		 out.print
 //ModelAndView view = new ModelAndView(  )
}catch(IOException e) {
	
}
}