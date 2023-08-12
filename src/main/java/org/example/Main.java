package org.example;

import dao.UserDao;
import model.User;

public class Main {
    public static void main(String[] args) {
        // DAO:

        UserDao userDao = new UserDao();
        User user = userDao.getUserBId(6L);
        System.out.println(user);
    }
}