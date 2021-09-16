/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Ramashankar kumar
 */
public class RegisterUserPojo {
    private String username;
    private String userid;
    private String password;
    private String mobileno;

    public RegisterUserPojo() {
    }

    public RegisterUserPojo(String username, String userid, String password, String mobileno) {
        this.username = username;
        this.userid = userid;
        this.password = password;
        this.mobileno = mobileno;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }
    
    
}
