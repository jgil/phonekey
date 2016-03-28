package com.phonekey.register.web;

import com.phonekey.register.domain.Register;
import com.phonekey.register.domain.RegisterRepository;
import com.phonekey.register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jordi on 25/03/2016.
 */

@RestController

public class RegisterRestController {

    private RegisterService registerService;

    @Autowired
    public void setRegisterService(RegisterService registerService) {
        this.registerService = registerService;
    }

    @RequestMapping(value = "/register/{user}", method = RequestMethod.POST)
    ResponseEntity<?> registerDevice(@PathVariable String user,
                                     @RequestBody Device device) {
        System.out.println(user + device.getToken());
        registerService.saveRegister(new Register(device.getToken(), user));
        return new ResponseEntity(null, null, HttpStatus.OK);
    }
}
