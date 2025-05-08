package com.example.stdaddress.Service;
import java.util.Optional;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.stdaddress.Repository.AddressRepo;
import com.example.stdaddress.Response.AddressResponse;
import com.example.stdaddress.entity.StudentAddress;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper mapper;

    public AddressResponse findAddressByStudentRollno(int stdRollno) {
        Optional<StudentAddress> addressByStdRollno = addressRepo.findAddressByStudentRollno(stdRollno);
        AddressResponse addressResponse = mapper.map(addressByStdRollno, AddressResponse.class);
        return addressResponse;
    }

}