package com.quizapp.modelClass;

public class QuestionClass {

    String que;
    String op1, op2, op3, op4;
    String correctOp;

    //constructor
    public QuestionClass(String que, String op1, String op2, String op3, String op4, String correctOp) {
        this.que = que;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.correctOp = correctOp;
    }

    //get and set
    public String getQue() {
        return que;
    }

    public String getOp1() {
        return op1;
    }

    public String getOp2() {
        return op2;
    }

    public String getOp3() {
        return op3;
    }

    public String getOp4() {
        return op4;
    }

    public String getCorrectOp() {
        return correctOp;
    }
}
