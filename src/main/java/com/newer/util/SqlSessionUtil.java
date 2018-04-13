package com.newer.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class SqlSessionUtil {

    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession   sqlSession=null;
    static {
        try {
            Reader reader= Resources.getResourceAsReader("mybatis-conf");
            sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        SqlSession   sqlSession= sqlSessionFactory.openSession();
        return sqlSession;
    }
    public static void closeSqlSession(SqlSession sqlSession){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }

}
