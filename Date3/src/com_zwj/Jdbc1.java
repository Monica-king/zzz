package com_zwj;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
public class Jdbc1 {
	public static void main(String[] args) throws Exception{

			//加载配置文件
			Properties pro=new Properties();
			//加载器
			InputStream resourceAsStream=Jdbc1.class.getClassLoader().getResourceAsStream("jdbc.properties");
			//下载
			pro.load(resourceAsStream);
			 
			 String property=pro.getProperty("name");
			 String password=pro.getProperty("password");
			 System.out.println(password);
			 System.out.println(property);
			 //数据库连接池对象
			 DataSource datasource=DruidDataSourceFactory.createDataSource(pro);
			 //数据库连接
			 System.out.println(datasource.getConnection());
			 //获取连接
			 Connection connection=datasource.getConnection();
			 
				//执行SQL对象
				Statement createStatement =connection.createStatement();
				//声明SQL
				String sql="select * from t_user";
				//执行查询
				ResultSet rs=createStatement.executeQuery(sql);
				//遍历结果
				while(rs.next()){
					String name=rs.getString("name");
					String address=rs.getString("address");
					String id=rs.getString("id");
					System.out.println(name+address+id);
				}
				//释放资源
				
				connection.close();
}
}
