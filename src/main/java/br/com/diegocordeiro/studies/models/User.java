package br.com.diegocordeiro.studies.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String fullName;
    private String nickname;
    private Integer age;
    private Role role;

    private static final Integer MAX_NEWER_AGE = 18;
    private static final Integer MAX_OLDER_AGE = 60;

    public User() {}

    public User(String fullName, String nickname, Integer age, Role role) {
        this.fullName = fullName;
        this.nickname = nickname;
        this.age = age;
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getAge() {
        return age;
    }

    public Role getRole() {
        return role;
    }

    public boolean isNewer () {

        return this.getAge() <= MAX_NEWER_AGE ? Boolean.TRUE : Boolean.FALSE;
    }

    public boolean isAdult () {

        return this.getAge() <= MAX_OLDER_AGE && this.getAge() > MAX_NEWER_AGE ? Boolean.TRUE : Boolean.FALSE;
    }

    public boolean isElder () {

        return this.getAge() >= MAX_OLDER_AGE ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + this.getFullName() + '\'' +
                ", nickname='" + this.getNickname() + '\'' +
                ", age=" + this.getAge() +
                ", role=" + this.getRole() +
                '}';
    }

    public static List<User> mountMockList() {

        User firstUser = new User("Diego J Cordeiro", "Diego", 28, Role.ADMIN);
        User secondUser = new User("Mayra A Rosa", "Mayra", 26, Role.DEFAULT);
        User thirdUser = new User("Davi Lucca A Cordeiro", "Davi Lucca", 1, Role.READER);

        List<User> userList = new ArrayList<>();
        userList.add(firstUser);
        userList.add(secondUser);
        userList.add(thirdUser);

        return userList;
    }
}
