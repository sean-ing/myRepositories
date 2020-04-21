package com.jxutcm.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxutcm.pojo.Student;
import com.jxutcm.service.StudentService;

@Controller
public class StudentController {

	@Resource
	private StudentService studentServiceImpl;
	
	/**
	 * 实现新增
	 * @param username
	 * @param password
	 * @param number
	 * @param age
	 * @param tbirth
	 * @param phone
	 * @param email
	 * @return
	 */
	@RequestMapping("insert")
	public String insert(String username,String password, String number, int age, String tbirth, String phone,
			String email) {
		Date birth = null;
		try {
			birth = new SimpleDateFormat("yyyy-MM-dd").parse(tbirth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		int index = studentServiceImpl.insStudent(username, password, number, age, birth, phone, email);
		
		if (index>0) {
			return "redirect:login.jsp";
		}else {
			return "redirect:add.jsp";
		}
	}
	/**
	 * 实现登录
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("login")
	public String login(String username,String password) {
		int index = studentServiceImpl.selByUsernamePwd(username, password);
		if (index>0) {
			return "main.jsp";
		} else {
			return "redirect:login.jsp";
		}
	}
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping("show")
	public String showAll(Model model) {
		Model list = model.addAttribute("list", studentServiceImpl.selAll());
		return "show.jsp";
	}
	/**
	 * 修改密码
	 * @param newpassword
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("update")
	public String update(String newpassword,String username,String password) {
		Student info = studentServiceImpl.selByInfo(username, password);
		if (info==null) {
			return "redirect:update.jsp";
		} else {
		int id=info.getId();
		int index = studentServiceImpl.updPwd(id, newpassword);
		if (index>0) {
			return "success.jsp";
		}else {
			return "redirect:update.jsp";
		}
		}
	}
	/**
	 * 删除用户
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("delete")
	public String delete(String username,String password) {
		Student info = studentServiceImpl.selByInfo(username, password);
		if (info==null) {
			return "redirect:delete.jsp";
		} else {
			int id=info.getId();
			int index = studentServiceImpl.delInfo(id);
			if (index>0) {
				return "success.jsp";
			}else {
				return "redirect:delete.jsp";
			}
		}
	}
}
