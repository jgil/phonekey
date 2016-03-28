package com.phonekey.register.service;

import com.phonekey.register.domain.Register;
import com.phonekey.register.domain.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jordi on 28/03/2016.
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    private RegisterRepository registerRepository;

    @Autowired
    public void setRegisterRepository(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    @Override
    public Register saveRegister(Register register) {
        return registerRepository.save(register);
    }
}
