package Com_zwj_Dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com_zwj.JDBCUtils1;
import Com_zwj_bean.User;

public class UserDaotmp implements UserDao{ 
	//创建对象
	JdbcTemplate jt=new JdbcTemplate(JDBCUtils1.getDataSource());
    
	public List <User> findAllUser() {
		String sql="select * from exo_user";
		jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
			return null;
		}
}
