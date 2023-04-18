package com.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.ToString;

@Controller
public  class DemoController {
@ResponseBody
  @RequestMapping("/") 
  public String home(){

	BoardVO boardVO = new BoardVO();
	boardVO.setTitle("타이틀");
	
	System.out.println(boardVO);
    return boardVO.toString(); 
  }

  @RequestMapping("/hello.do")
  public String hello(Model model){
	System.out.println("안녕하세요");
	model.addAttribute("message","hello.jsp입니다.!_dev");
	return "hello";
  } 
}

