package com.socge.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class Camt053 {

    @Id
    private Long id;

    private String codeBic;
    private Double amount;
    private Date dateOfTransaction;

}
