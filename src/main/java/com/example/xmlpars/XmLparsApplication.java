package com.example.xmlpars;

import com.example.xmlpars.otherParsing.XmlRoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringReader;
import java.util.stream.Collectors;

@SpringBootApplication
public class XmLparsApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmLparsApplication.class, args);

    }

}
