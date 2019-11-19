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
			// ����һ���Ự�����������
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			// �����Ự��������
			SqlSessionFactory factory = builder.build(inputStream);
			// �����Ự,�����дΪtrue�Ļ����Զ��ύ����
			session = factory.openSession(true);

			// List<User> list=session.selectList("com.jbit.entity.User.allUser");
			// for (User user : list) {
			// System.out.println(user);
			// }

			// ����id��ѯ
			// User user = session.selectOne("com.jbit.entity.User.UserId", 3);
			// System.out.println(user);

			// ����
			// User user=new User(0,"��֪��", "112233");
			// int insert = session.insert("com.jbit.entity.User.Userinsert",user);
			// System.out.println(insert);

			// ɾ��
			// int delete = session.delete("com.jbit.entity.User.deleteUser",4);
			// System.out.println(delete);

			// �޸�
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
