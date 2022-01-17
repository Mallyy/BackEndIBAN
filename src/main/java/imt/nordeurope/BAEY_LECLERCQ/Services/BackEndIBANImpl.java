package imt.nordeurope.BAEY_LECLERCQ.Services;

import imt.nordeurope.BAEY_LECLERCQ.Model.BackEndIBAN;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BackEndIBANImpl implements  IBackEndIBAN{

    String URL_FRONTEND=null; // url du formulaire qui envoie iban
    @Override
    public BackEndIBAN getIBAN() {
        RestTemplate restTemplate = new RestTemplate();
        String ibanToCheck = restTemplate.getForObject(URL_FRONTEND, String.class);
        BackEndIBAN backEndIBAN = new BackEndIBAN();
        backEndIBAN.setIBAN(ibanToCheck);
        backEndIBAN.isIBANValid();

        return backEndIBAN ;
    }
}
