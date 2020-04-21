package com.jxutcm.service.impl;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jxutcm.mapper.StudentMapper;
import com.jxutcm.pojo.Student;
import com.jxutcm.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Resource
	private StudentMapper studentMapper;

	/**
	 * 新增
	 */
	@Override
	public int insStudent(String username, String password, String number, int age, Date birth, String phone,
			String email) {
		// TODO Auto-generated method stub
		return studentMapper.insStudent(username, password, number, age, birth, phone, email);
	}

	/**
	 * 登录
	 */
	@Override
	public int selByUsernamePwd(String username, String password) {
		// TODO Auto-generated method stub
		return studentMapper.selByNnamePwd(username, password);
	}

	/**
	 * 查询全部
	 */
	@Override
	public List<Student> selAll() {
		// TODO Auto-generated method stub
		return studentMapper.selAll();
	}

	/**
	 * 修改密码
	 */
	@Override
	public int updPwd(int id, String newpassword) {
		// TODO Auto-generated method stub
		return studentMapper.updByPwd(id, newpassword);
	}

	/**
	 * 查询个人信息
	 */
	@Override
	public Student selByInfo(String username, String password) {
		// TODO Auto-generated method stub
		return studentMapper.selByInfo(username, password);
	}

	/**
	 * 删除个人信息
	 */
	@Override
	public int delInfo(int id) {
		// TODO Auto-generated method stub
		return studentMapper.delByInfo(id);
	}
}
