package com.clh.spring.bean;

import java.util.HashMap;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public class UserDao {
    private HashMap<String, String> map;
    {
        map = new HashMap<>();
        map.put("1", "z3");
        map.put("2", "l4");
        map.put("3", "w5");
    }

    public String getById(String uid) {
        return map.get(uid);
    }
}
