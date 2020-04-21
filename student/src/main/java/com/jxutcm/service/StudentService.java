package com.jxutcm.service;

import java.util.Date;
import java.util.List;

import com.jxutcm.pojo.Student;

public interface StudentService {

	/**
	 * 实现新增
	 * @param username
	 * @param password
	 * @param number
	 * @param age
	 * @param birth
	 * @param phone
	 * @param email
	 * @return
	 */
	int insStudent(String username,String password,String number,int age,Date birth,String phone,String email);
	
	/**
	 * 实现登录功能
	 * @param username
	 * @param password
	 * @return
	 */
	int selByUsernamePwd(String username,String password);
	
	/**
	 * 查询全部
	 * @return
	 */
	List<Student> selAll();
	/**
	 * 查询个人信息
	 * @param username
	 * @param password
	 * @return
	 */
	Student selByInfo(String username,String password);
	/**
	 * 修改密码
	 * @param id
	 * @param newpassword
	 * @return
	 */
	int updPwd(int id,String newpassword);
	/**
	 * 删除个人信息
	 * @param id
	 * @return
	 */
	int delInfo(int id);
}
