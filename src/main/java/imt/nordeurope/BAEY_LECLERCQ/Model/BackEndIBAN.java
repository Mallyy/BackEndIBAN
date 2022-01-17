package imt.nordeurope.BAEY_LECLERCQ.Model;

import org.iban4j.IbanUtil;

public class BackEndIBAN {
    private String IBAN;
    private boolean isValid;

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }


    public boolean isIBANValid() {
            try{
                IbanUtil.validate(this.IBAN);
                isValid = true;

            } catch (Throwable t){
                isValid = false;
            }
        return false;
    }
}
