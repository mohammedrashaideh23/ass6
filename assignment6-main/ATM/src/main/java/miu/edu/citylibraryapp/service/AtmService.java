package miu.edu.citylibraryapp.service;

import miu.edu.citylibraryapp.model.ATM;
import miu.edu.citylibraryapp.repository.ATMrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtmService {

    @Autowired
    ATMrepository atMrepository;

    public ATM createATM(ATM atm){
        return atMrepository.save(atm);
    }
}
