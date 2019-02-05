package com.socge.core.service;

import com.socge.model.Camt053;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArchivageCamt053 {

    // CREATION D UN CAMT053 POUR LE TRANSFORMER EN JSON ET LE METTRE DS MESSAGE
    public List<Camt053> creationDuneListAleatoireDeCamt053(){
        int i = 0;
        List<Camt053> camt053List = new ArrayList<>();
        while( i++ < Math.round(Math.random()*10) ){
            Camt053 camt053 = new Camt053();
            camt053List.add(camt053);
        }
        return camt053List;
    }


}
