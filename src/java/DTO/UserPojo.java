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
public class UserPojo {
    private String userid;
    private String password;

    public UserPojo() {
    }

    public UserPojo(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }
    
    
}
