package com.clh.spring.bean;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public class UserService {
    private String uId;
    private UserDao userDao;

    public void setuId(String uId) {
        this.uId = uId;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getuId() {
        return uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public UserService() {

    }

    public void queryUserInfo(String id) {
        System.out.println("print : " + uId + ":L" + userDao.getById(id));
    }
}
