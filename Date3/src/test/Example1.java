package test;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import Com_zwj_bean.User;
import com_zwj.JDBCUtils1;
public class Example1 {
	private static void add(){
		//���
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		//
		String sql ="insert into exo_user(id,name,address,age,height)values(?,?,?,?,?)";
		int update =jt.update(sql,1,"��ѫ","����",25,183.5);
		System.out.println(update);
	}
	private static void add1(){
		//���
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		//
		String sql ="insert into exo_user(id,name,address,age,height)values(?,?,?,?,?)";
		int update =jt.update(sql,2,"����","����",27,185.5);
		System.out.println(update);
	}
	private static void add2(){
		//���
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		//
		String sql ="insert into exo_user(id,name,address,age,height)values(?,?,?,?,?)";
		int update =jt.update(sql,3,"����","����",25,178.5);
		System.out.println(update);
	}
	private static void add3(){
		//���
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		//
		String sql ="insert into exo_user(id,name,address,age,height)values(?,?,?,?,?)";
		int update =jt.update(sql,4,"CHEN","����",27,185.5);
		System.out.println(update);
	}
	private static void add4(){
		//���
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		//
		String sql ="insert into exo_user(id,name,address,age,height)values(?,?,?,?,?)";
		int update =jt.update(sql,5,"D.O","����",27,180.5);
		System.out.println(update);
		}
	//�޸�
	/*private static void update1(){
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
	    int update =jt.update("update exo_user set name=? ,where id=?","SEHUN");
	    System.out.println(update);
	}*/
	//ɾ��
	/*private static void delete1(){
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
	    int update =jt.update("delete from  exo_user where id= ","SEHUN");
	    System.out.println(update);
	}
	*/
	//��ѯ
	/*private static void find1(){
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		List<User> list=jt.query("select * from exo_user",new BeanPropertyRowMapper<User> (User.class));
		User user = list get(0);
			System.out.println(user);
			System.out.println(list);
		}
	private static void find(){
		JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
		List<User> list=jt.query("select * from exo_user",new BeanPropertyRowMapper<User> (User.class));
			System.out.println(user);
		}
	*/
	//��ѯ
		private static void find(){
			JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
			User user=jt.queryForObject("select * from exo_user where id =? ",new BeanPropertyRowMapper<User> (User.class),1);
			System.out.println(user);
		}
	public static void main(){
		add();
	}
	
	}

