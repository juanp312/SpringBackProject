package com.BackProject.BackProject.controller;

import com.BackProject.BackProject.domain.Identification;
import com.BackProject.BackProject.services.ServiceIdentificacion;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop/vendors/")
public class Controller {
    private final ServiceIdentificacion service_;

    public Controller(ServiceIdentificacion service_) {
        this.service_ = service_;
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Identification creatNewIdentification(@RequestBody Identification newIdentification){
        System.out.println("Someone is requesting the service" + newIdentification.toString());
        return service_.saveIdentification(newIdentification);
    }

}
