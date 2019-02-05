package com.socge.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class Camt053 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String codeBic;
    private Double amount;
    private Date dateOfTransaction;

    public Camt053(String codeBic, Double amount, Date dateOfTransaction){
        this.codeBic = codeBic;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
    }

    public Camt053(){
        this.codeBic = "BIC" + Math.round(Math.random()*100000) + "XXXX";
        this.amount = (double) Math.round(Math.random()*100000)/10;
        this.dateOfTransaction = new Date();
    }

   // public Camt053(){}

    public String toString(){
        return "CodeBic_" + this.codeBic + " | Amount_" + this.amount + " | Date_"+ this.dateOfTransaction.toString();
    }



}
