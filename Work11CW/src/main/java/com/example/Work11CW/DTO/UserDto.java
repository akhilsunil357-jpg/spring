package com.example.Work11W.DTO;

public class UserDto {
   
    private String mobile;
    private String password;
    private String fullname;

    
   
    public UserDto(String email, String password, String fullname,String address,String dob) {
        super();
        this.mobile = mobile;
        this.password = password;
        this.fullname = fullname;

    }

    public String getmobile() {
        return mobile;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    



   
}