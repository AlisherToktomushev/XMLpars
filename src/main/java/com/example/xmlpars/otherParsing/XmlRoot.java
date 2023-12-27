package com.example.xmlpars.otherParsing;
import com.example.xmlpars.RowParsing.Row;

import javax.xml.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@XmlRootElement(name = "REPORT_DATA")
@XmlAccessorType(XmlAccessType.FIELD)
public class XmlRoot {
    private CustomDataPars customDa_ta;

    private String report_Xslt;

    private String id_;

    private String ow_ner;

    private String bank_Name;

    private String cg_Name;

    private String printingDa_te;

    @XmlElementWrapper(name = "ROWSET")
    @XmlElement(name = "ROW")
    private List<Row> rows;

    @XmlElement(name = "custom_data")
    public CustomDataPars getCustomData() {
        return customDa_ta;
    }

    public void setCustomData(CustomDataPars customData) {
        this.customDa_ta= customData;
    }

    @XmlElement(name = "report_xslt")
    public String getReportXslt() {
        return report_Xslt;
    }

    public void setReportXslt(String reportXslt) {
        this.report_Xslt = reportXslt;
    }

    @XmlElement(name = "id")
    public String getId() {
        return id_;
    }

    public void setId(String id) {
        this.id_ = id;
    }

    @XmlElement(name = "owner")
    public String getOwner() {
        return ow_ner;
    }

    public void setOwner(String owner) {
        this.ow_ner = owner;
    }

    @XmlElement(name = "bank_name")
    public String getBankName() {
        return bank_Name;
    }

    public void setBankName(String bankName) {
        this.bank_Name = bankName;
    }

    @XmlElement(name = "cg_name")
    public String getCgName() {
        return cg_Name;
    }

    public void setCgName(String cgName) {
        this.cg_Name = cgName;
    }

    @XmlElement(name = "printing_date")
    public String getPrintingDate() {
        return printingDa_te;
    }

    public void setPrintingDate(String printingDate) {
        this.printingDa_te = printingDate;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
}