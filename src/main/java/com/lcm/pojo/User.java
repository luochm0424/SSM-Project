package com.lcm.pojo;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private String sendemailaddress;

    private Integer state;

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sendemailaddress='" + sendemailaddress + '\'' +
                ", state=" + state +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSendemailaddress() {
        return sendemailaddress;
    }

    public void setSendemailaddress(String sendemailaddress) {
        this.sendemailaddress = sendemailaddress;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}