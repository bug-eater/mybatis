package com.newer.util;

import com.newer.dao.UserDao;
import com.newer.pojo.Car;
import org.apache.ibatis.session.SqlSession;

import java.sql.Date;

public class Test {

    public void test1(){
        Car car =new Car();
        car.setName("机车");
        car.setPrice(9999.99);
        car.setCreate_date(new Date(2018-2-3));
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        System.out.println(userDao.addCar(car));
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession();
    }
    public static void main(String[] args) {
       Test ct=new Test();
        ct.test1();
    }
}
