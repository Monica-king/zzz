package com_zwj;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import Com_zwj_bean.User;

public class JDBCUtils{
	public static void main(String[] args){
		//��ѯ
		/*JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		String sql="select * from exo_user";
		List<User> list=jt.query("update exo_user set name=?,age=?,where id=?",new BeanPropertyRowMapper<User> (User.class),"����ѫ",25,1);
		for(User user : list){
			System.out.println(user);
		}*/
		
		//add();
		//update();
		//delete();
		//find();
	}
	/*private static void add(){
		//���
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		//
		String sql ="insert into exo_user(id,name,username,age,height,address)values(?,?,?,?,?,?)";
		int update1 =jt.update(sql,6,"��ѫ","æ��",25,183.5,"����");
		//int update2 =jt.update(sql,2,"����","����",27,185.5,"����");
		//int update3 =jt.update(sql,3,"����","����",25,178.5,"����");
		//int update4 =jt.update(sql,4,"CHEN","����",27,185.5,"����");
		//int update5 =jt.update(sql,5,"D.O","�ɰ�",27,180.5,"����");
		System.out.println(update1);

	}*/
	
	//�޸�
	/*private static void update(){
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		int update6 =jt.update("update exo_user set name=?,age=?,where id=?","����ѫ",25,1);
		System.out.println(update6);
	}*/
	
	
	//ɾ��
	/*private static void delete(){
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
	    int update =jt.update("delete from  exo_user where id=1");
	    System.out.println(update);
   }*/
	/*private static void delete(){
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
	    int update =jt.update("delete from  exo_user where name=?","D.O");
	    System.out.println(update);
   }*/
	//��ѯ
	/*private static void find(){
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		User user=jt.queryForObject("select * from exo_user where id =? ",new BeanPropertyRowMapper<User> (User.class),1);
		System.out.println(user);
	}*/
	
}