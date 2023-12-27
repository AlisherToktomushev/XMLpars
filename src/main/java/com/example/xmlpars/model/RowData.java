package com.example.xmlpars.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class RowData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String num;
    long A_PK;
    int A_CARD_ACCT;
    String A_CCY;
    long A_CCY_FMT;
    int A_STATUS;
    int A_CRD;
    double A_BALANCE;
    double G_PRODUCT;
    double G_BRANCH;
    double CUST_ID_I;
    int CUST_TYPE;
    String CUST_NAME;
    double INV_TOTAL;
    int INV_DPD;

}
