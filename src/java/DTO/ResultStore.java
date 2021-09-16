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
public class ResultStore { 
     private String username;
     private String userid;
   
    private int totalrightanswer;
    private int totalwronganswer;
    private int setid;
    private String language;

    public ResultStore() {
    }

    public ResultStore(String username, String userid, int totalrightanswer, int totalwronganswer, int setid, String language) {
        this.username = username;
        this.userid = userid;
        this.totalrightanswer = totalrightanswer;
        this.totalwronganswer = totalwronganswer;
        this.setid = setid;
        this.language = language;
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

    public int getTotalrightanswer() {
        return totalrightanswer;
    }

    public void setTotalrightanswer(int totalrightanswer) {
        this.totalrightanswer = totalrightanswer;
    }

    public int getTotalwronganswer() {
        return totalwronganswer;
    }

    public void setTotalwronganswer(int totalwronganswer) {
        this.totalwronganswer = totalwronganswer;
    }

    public int getSetid() {
        return setid;
    }

    public void setSetid(int setid) {
        this.setid = setid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    
}
