package com.xjc.password;

import org.springframework.security.core.userdetails.User;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/7/2 18:06
 * @name TestPasswd
 */
public class TestPasswd {
    public static void main(String[] args) {
        //noop  pbkdf2  scrypt  sha256
//        String idForEncode = "bcrypt";
//        Map encoders = new HashMap<>();
//        encoders.put(idForEncode, new BCryptPasswordEncoder());
//        PasswordEncoder passwordEncoder =
//                new DelegatingPasswordEncoder(idForEncode, encoders);
//        System.out.println(passwordEncoder.encode("1234"));
//
//        boolean bcrypt = passwordEncoder.matches("$2a$10$cBuAWXv34.EnYN0o1eq/BOPhO/GkYyoVBNuyGZGvLSuyQQaSco00S", "bcrypt");
        User user = (User) User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("user")
                .build();
        System.out.println(user.getPassword());

    }
}
