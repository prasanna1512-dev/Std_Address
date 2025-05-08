package com.example.stdaddress.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stdaddress.Response.AddressResponse;
import com.example.stdaddress.Service.AddressService;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address/{stdRollno}")
    public ResponseEntity<AddressResponse> getAddressByStudentRollno(@PathVariable("stdRollno") int stdRollno) {
        AddressResponse addressResponse = addressService.findAddressByStudentRollno(stdRollno);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }
    

}