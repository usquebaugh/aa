package com.jbit.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jbit.entity.User;

public class Test {
	public static void main(String[] args) {
		SqlSession session = null;
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			// 创建一个会话工厂建造对象
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			// 创建会话工厂对象
			SqlSessionFactory factory = builder.build(inputStream);
			// 开启会话,如果填写为true的话，自动提交事务
			session = factory.openSession(true);

			// List<User> list=session.selectList("com.jbit.entity.User.allUser");
			// for (User user : list) {
			// System.out.println(user);
			// }

			// 根据id查询
			// User user = session.selectOne("com.jbit.entity.User.UserId", 3);
			// System.out.println(user);

			// 增加
			// User user=new User(0,"不知道", "112233");
			// int insert = session.insert("com.jbit.entity.User.Userinsert",user);
			// System.out.println(insert);

			// 删除
			// int delete = session.delete("com.jbit.entity.User.deleteUser",4);
			// System.out.println(delete);

			// 修改
			// User user=new User(2, "hehe", "312312");
			// int update = session.update("com.jbit.entity.User.updateUser",user);
			// System.out.println(update);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
