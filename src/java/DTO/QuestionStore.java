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
public class QuestionStore {
     private int qno;
     private String Question;
     private String answer1;
     private String answer2;
     private String answer3;
     private String answer4;
     private String rightanswer;
     private int totalqno;
     private int setid;
     private String language;

    public QuestionStore() {
    }
 
    public QuestionStore(int qno, String Question, String answer1, String answer2, String answer3, String answer4, String rightanswer, int totalqno, int setid, String language) {
        this.qno = qno;
        this.Question = Question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.rightanswer = rightanswer;
        this.totalqno = totalqno;
        this.setid = setid;
        this.language = language;
    }
   
    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getRightanswer() {
        return rightanswer;
    }

    public void setRightanswer(String rightanswer) {
        this.rightanswer = rightanswer;
    }

    public int getTotalqno() {
        return totalqno;
    }

    public void setTotalqno(int totalqno) {
        this.totalqno = totalqno;
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
