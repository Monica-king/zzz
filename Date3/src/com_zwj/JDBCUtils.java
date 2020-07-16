package com_zwj;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import Com_zwj_bean.User;

public class JDBCUtils{
	public static void main(String[] args){
		//查询
		/*JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		String sql="select * from exo_user";
		List<User> list=jt.query("update exo_user set name=?,age=?,where id=?",new BeanPropertyRowMapper<User> (User.class),"吴世勋",25,1);
		for(User user : list){
			System.out.println(user);
		}*/
		
		//add();
		//update();
		//delete();
		//find();
	}
	/*private static void add(){
		//添加
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		//
		String sql ="insert into exo_user(id,name,username,age,height,address)values(?,?,?,?,?,?)";
		int update1 =jt.update(sql,6,"世勋","忙内",25,183.5,"韩国");
		//int update2 =jt.update(sql,2,"灿烈","门面",27,185.5,"韩国");
		//int update3 =jt.update(sql,3,"伯贤","包子",25,178.5,"韩国");
		//int update4 =jt.update(sql,4,"CHEN","高音",27,185.5,"韩国");
		//int update5 =jt.update(sql,5,"D.O","可爱",27,180.5,"韩国");
		System.out.println(update1);

	}*/
	
	//修改
	/*private static void update(){
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		int update6 =jt.update("update exo_user set name=?,age=?,where id=?","吴世勋",25,1);
		System.out.println(update6);
	}*/
	
	
	//删除
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
	//查询
	/*private static void find(){
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		User user=jt.queryForObject("select * from exo_user where id =? ",new BeanPropertyRowMapper<User> (User.class),1);
		System.out.println(user);
	}*/
	
}