package com.example.xmlpars.controller;


import com.example.xmlpars.model.CustomData;
import com.example.xmlpars.model.RowData;
import com.example.xmlpars.service.ServiceXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
        @Autowired
        private ServiceXML serviceXML;

    @PostMapping("/save")
    public ResponseEntity <String>saveXmlData(@RequestBody String xmlData) {
        if (xmlData.isEmpty()) {
            throw new IllegalArgumentException("Пустой XML");
        } else {
            serviceXML.saveXmlData(xmlData);
            return ResponseEntity.ok("Данные успешно сохранены");

        }
    }
    @GetMapping("/getRow")
    public Iterable<RowData> getAllXml(){
       return serviceXML.findAll();
    }
    @GetMapping("/getData")
    public Iterable<CustomData> getAllRow(){
       return serviceXML.findAllData();
    }
}
