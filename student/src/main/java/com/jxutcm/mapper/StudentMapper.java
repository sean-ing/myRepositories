package com.jxutcm.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jxutcm.pojo.Student;

public interface StudentMapper {

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
	@Insert("insert into student values(default,#{username},#{password},#{number},#{age},#{birth},#{phone},#{email})")
	int insStudent(@Param("username") String username,@Param("password") String password,@Param("number") String number,
			@Param("age") int age,@Param("birth") Date birth,@Param("phone") String phone,@Param("email") String email);
	/**
	 * ʵ�ֵ�¼����
	 * @param username
	 * @param password
	 * @return
	 */
	@Select("select count(*) from student where username=#{username} and password=#{password}")
	int selByNnamePwd(@Param("username")String username,@Param("password")String password);
	
	/**
	 * ��ѯȫ��
	 * @param student
	 * @return
	 */
	@Select("select * from student")
	List<Student> selAll();
	/**
	 * ��ѯ������Ϣ
	 * @param username
	 * @param password
	 * @return
	 */
	@Select("select * from student where username=#{username} and password=#{password}")
	Student selByInfo(@Param("username")String username,@Param("password")String password);
	/**
	 * �޸�����
	 * @param id
	 * @param newpassword
	 * @return
	 */
	@Update("update student set password=#{newpassword} where id=#{id}")
	int updByPwd(@Param("id")int id,@Param("newpassword")String newpassword);
	/**
	 * ɾ��������Ϣ
	 * @param id
	 * @return
	 */
	@Delete("delete from student where id=#{id}")
	int delByInfo(int id);
}
