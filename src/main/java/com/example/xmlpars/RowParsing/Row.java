package com.example.xmlpars.RowParsing;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Row {

    private String aCcy;

    String num;

    long A_PK;

    int A_CARD_ACCT;

    String A_CCY;

    long A_CCY_FMT;

    int A_STATUS;

    int A_CRD;

    double A_BALANCE;

    int G_PRODUCT;

    double G_BRANCH;

    double CUST_ID_I;

    int CUST_TYPE;

    String CUST_NAME;

    double INV_TOTAL;

    int INV_DPD;
    @XmlElement(name = "A_CCY")
    public String getaCcy() {
        return aCcy;
    }

    public void setaCcy(String aCcy) {
        this.aCcy = aCcy;
    }
    @XmlAttribute(name = "num")
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    @XmlElement(name = "A_PK")
    public long getA_PK() {
        return A_PK;
    }

    public void setA_PK(int a_PK) {
        A_PK = a_PK;
    }
    @XmlElement(name = "A_CARD_ACCT")
    public int getA_CARD_ACCT() {
        return A_CARD_ACCT;
    }

    public void setA_CARD_ACCT(int a_CARD_ACCT) {
        A_CARD_ACCT = a_CARD_ACCT;
    }
    @XmlElement(name = "A_CCY")
    public String getA_CCY() {
        return A_CCY;
    }

    public void setA_CCY(String a_CCY) {
        A_CCY = a_CCY;
    }
    @XmlElement(name = "A_CCY_FMT")
    public long getA_CCY_FMT() {
        return A_CCY_FMT;
    }

    public void setA_CCY_FMT(int a_CCY_FMT) {
        A_CCY_FMT = a_CCY_FMT;
    }
    @XmlElement(name = "A_STATUS")
    public int getA_STATUS() {
        return A_STATUS;
    }

    public void setA_STATUS(int a_STATUS) {
        A_STATUS = a_STATUS;
    }
    @XmlElement(name = "A_CRD")
    public int getA_CRD() {
        return A_CRD;
    }

    public void setA_CRD(int a_CRD) {
        A_CRD = a_CRD;
    }
    @XmlElement(name = "A_BALANCE")
    public double getA_BALANCE() {
        return A_BALANCE;
    }

    public void setA_BALANCE(double a_BALANCE) {
        A_BALANCE = a_BALANCE;
    }
    @XmlElement(name = "G_PRODUCT")
    public int getG_PRODUCT() {
        return G_PRODUCT;
    }

    public void setG_PRODUCT(int g_PRODUCT) {
        G_PRODUCT = g_PRODUCT;
    }
    @XmlElement(name = "G_BRANCH")
    public double getG_BRANCH() {
        return G_BRANCH;
    }

    public void setG_BRANCH(int g_BRANCH) {
        G_BRANCH = g_BRANCH;
    }
    @XmlElement(name = "CUST_ID_I")
    public double getCUST_ID_I() {
        return CUST_ID_I;
    }

    public void setCUST_ID_I(int CUST_ID_I) {
        this.CUST_ID_I = CUST_ID_I;
    }
    @XmlElement(name = "CUST_TYPE")
    public int getCUST_TYPE() {
        return CUST_TYPE;
    }

    public void setCUST_TYPE(int CUST_TYPE) {
        this.CUST_TYPE = CUST_TYPE;
    }
    @XmlElement(name = "CUST_NAME")
    public String getCUST_NAME() {
        return CUST_NAME;
    }

    public void setCUST_NAME(String CUST_NAME) {
        this.CUST_NAME = CUST_NAME;
    }
    @XmlElement(name = "INV_TOTAL")
    public double getINV_TOTAL() {
        return INV_TOTAL;
    }

    public void setINV_TOTAL(double INV_TOTAL) {
        this.INV_TOTAL = INV_TOTAL;
    }
    @XmlElement(name = "INV_DPD")
    public int getINV_DPD() {
        return INV_DPD;
    }

    public void setINV_DPD(int INV_DPD) {
        this.INV_DPD = INV_DPD;
    }
}
