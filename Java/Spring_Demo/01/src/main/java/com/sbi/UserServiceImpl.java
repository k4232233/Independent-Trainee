package com.sbi;

public class UserServiceImpl implements UserService{
//    private UserDao userDao = new UserDaoImpl();
    //利用set实现
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
