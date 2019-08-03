package com.itheima.mapper.Imp;

import com.itheima.domain.User;
import com.itheima.mapper.Interface.IUserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDao implements IUserDao {
    private SqlSessionFactory sqlSessionFactory;

    public UserDao(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findByUserId(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("testfindByUserId", id);
        sqlSession.close();
        return user;
    }

    public List<User> findUserByUsername(String username) {
        return null;
    }

    public int saveUser(User user) {
        return 0;
    }
}
