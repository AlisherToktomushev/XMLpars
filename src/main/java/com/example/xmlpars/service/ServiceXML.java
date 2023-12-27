package com.example.xmlpars.service;


import com.example.xmlpars.RowParsing.Row;
import com.example.xmlpars.XmLparsApplication;
import com.example.xmlpars.model.CustomData;
import com.example.xmlpars.model.RowData;
import com.example.xmlpars.otherParsing.XmlRoot;
import com.example.xmlpars.repository.CustomDataJpa;
import com.example.xmlpars.repository.RowDataJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.stream.Collectors;

@Service
public class ServiceXML {
    @Autowired
    private RowDataJpa repository;
    @Autowired
    private CustomDataJpa customDataJpa;


    public void saveXmlData(String xmlData) {
        try {
//            BufferedReader br = new BufferedReader(new FileReader("res/"));
//            String body = br.lines().collect(Collectors.joining());
//            StringReader reader = new StringReader(body);
//            JAXBContext jaxbContext = JAXBContext.newInstance(XmlRoot.class);
//            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            JAXBContext context = JAXBContext.newInstance(XmlRoot.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            XmlRoot xmlRoot = (XmlRoot) unmarshaller.unmarshal(new StringReader(xmlData));

            CustomData customDataEntity = new CustomData();
            customDataEntity.setDpd_from(xmlRoot.getCustomData().getDpdFrom());
            customDataEntity.setDpd_till(xmlRoot.getCustomData().getDpdTill());
            customDataEntity.setBank_code(xmlRoot.getCustomData().getBankCode());
            customDataEntity.setCard_group_code(xmlRoot.getCustomData().getCardGroupCode());
            customDataEntity.setJust_totals(xmlRoot.getCustomData().getJustTotals());
            customDataEntity.setReport_xslt(xmlRoot.getReportXslt());
            customDataEntity.setId_DRP(xmlRoot.getId());
            customDataEntity.setOwner(xmlRoot.getOwner());
            customDataEntity.setBank_name(xmlRoot.getBankName());
            customDataEntity.setCg_name(xmlRoot.getCgName());
            customDataEntity.setPrinting_date(xmlRoot.getPrintingDate());
            customDataJpa.save(customDataEntity);

            for (Row row : xmlRoot.getRows()) {
                RowData entity = new RowData();
                entity.setNum(row.getNum());
                entity.setA_CCY(row.getA_CCY());
                entity.setA_PK(row.getA_PK());
                entity.setA_CARD_ACCT(row.getA_CARD_ACCT());
                entity.setA_CCY_FMT(row.getA_CCY_FMT());
                entity.setA_STATUS(row.getA_STATUS());
                entity.setA_CRD(row.getA_CRD());
                entity.setA_BALANCE(row.getA_BALANCE());
                entity.setG_PRODUCT(row.getG_PRODUCT());
                entity.setG_BRANCH(row.getG_BRANCH());
                entity.setCUST_ID_I(row.getCUST_ID_I());
                entity.setCUST_TYPE(row.getCUST_TYPE());
                entity.setCUST_NAME(row.getCUST_NAME());
                entity.setINV_TOTAL(row.getINV_TOTAL());
                entity.setINV_DPD(row.getINV_DPD());
                repository.save(entity);
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Iterable<CustomData> findAllData() {
        return customDataJpa.findAll();

    }

    public Iterable<RowData> findAll() {
      return repository.findAll();

    }
}


