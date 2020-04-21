package com.jxutcm.service;

import java.util.Date;
import java.util.List;

import com.jxutcm.pojo.Student;

public interface StudentService {

	/**
	 * ʵ������
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
	 * ʵ�ֵ�¼����
	 * @param username
	 * @param password
	 * @return
	 */
	int selByUsernamePwd(String username,String password);
	
	/**
	 * ��ѯȫ��
	 * @return
	 */
	List<Student> selAll();
	/**
	 * ��ѯ������Ϣ
	 * @param username
	 * @param password
	 * @return
	 */
	Student selByInfo(String username,String password);
	/**
	 * �޸�����
	 * @param id
	 * @param newpassword
	 * @return
	 */
	int updPwd(int id,String newpassword);
	/**
	 * ɾ��������Ϣ
	 * @param id
	 * @return
	 */
	int delInfo(int id);
}
