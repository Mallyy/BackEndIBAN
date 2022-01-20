package imt.nordeurope.BAEY_LECLERCQ.Services;

import imt.nordeurope.BAEY_LECLERCQ.Model.BackEndIBAN;
import org.springframework.stereotype.Component;

@Component
public class BackEndIBANImpl implements  IBackEndIBAN{

    String URL_FRONTEND=null; // url du formulaire qui envoie iban

    @Override
    public BackEndIBAN checkIBAN(String IBAN) {
        BackEndIBAN backEndIBAN = new BackEndIBAN();
        backEndIBAN.setIBAN(IBAN);
        backEndIBAN.isIBANValid();
        return backEndIBAN ;
    }
}
