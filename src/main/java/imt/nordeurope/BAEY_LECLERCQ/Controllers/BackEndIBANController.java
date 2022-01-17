package imt.nordeurope.BAEY_LECLERCQ.Controllers;

import imt.nordeurope.BAEY_LECLERCQ.Model.BackEndIBAN;
import imt.nordeurope.BAEY_LECLERCQ.Services.IBackEndIBAN;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class BackEndIBANController {
    @Inject
    private IBackEndIBAN service;


    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity checkIBAN(){
        return new ResponseEntity(service.getIBAN(), HttpStatus.OK);
    }

}
