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

			//���������ļ�
			Properties pro=new Properties();
			//������
			InputStream resourceAsStream=Jdbc1.class.getClassLoader().getResourceAsStream("jdbc.properties");
			//����
			pro.load(resourceAsStream);
			 
			 String property=pro.getProperty("name");
			 String password=pro.getProperty("password");
			 System.out.println(password);
			 System.out.println(property);
			 //���ݿ����ӳض���
			 DataSource datasource=DruidDataSourceFactory.createDataSource(pro);
			 //���ݿ�����
			 System.out.println(datasource.getConnection());
			 //��ȡ����
			 Connection connection=datasource.getConnection();
			 
				//ִ��SQL����
				Statement createStatement =connection.createStatement();
				//����SQL
				String sql="select * from t_user";
				//ִ�в�ѯ
				ResultSet rs=createStatement.executeQuery(sql);
				//�������
				while(rs.next()){
					String name=rs.getString("name");
					String address=rs.getString("address");
					String id=rs.getString("id");
					System.out.println(name+address+id);
				}
				//�ͷ���Դ
				
				connection.close();
}
}
