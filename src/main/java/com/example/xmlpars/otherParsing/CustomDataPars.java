package com.example.xmlpars.otherParsing;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomDataPars {
    private int dpdFrom;
    private int dpdTill;
    private int bankCode;
    private int cardGroupCode;

    private int justTotals;
    @XmlElement(name = "dpd_from")
    public int getDpdFrom() {
        return dpdFrom;
    }

    public void setDpdFrom(int dpdFrom) {
        this.dpdFrom = dpdFrom;
    }
    @XmlElement(name = "dpd_till")
    public int getDpdTill() {
        return dpdTill;
    }

    public void setDpdTill(int dpdTill) {
        this.dpdTill = dpdTill;
    }
    @XmlElement(name = "bank_code")
    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getCardGroupCode() {
        return cardGroupCode;
    }
    @XmlElement(name = "card_group_code")
    public void setCardGroupCode(int cardGroupCode) {
        this.cardGroupCode = cardGroupCode;
    }
    @XmlElement(name = "just_totals")
    public int getJustTotals() {
        return justTotals;
    }

    public void setJustTotals(int justTotals) {
        this.justTotals = justTotals;
    }



}