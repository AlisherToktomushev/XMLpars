package com.example.xmlpars.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class CustomData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int dpd_from;
    int dpd_till;
    int bank_code;
    int card_group_code;
    int just_totals;
    String report_xslt;
    String id_DRP;
    String owner;
    String bank_name;
    String cg_name;
    String printing_date;

}
