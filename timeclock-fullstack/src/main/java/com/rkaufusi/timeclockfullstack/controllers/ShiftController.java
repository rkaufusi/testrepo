package com.rkaufusi.timeclockfullstack.controllers;

import com.rkaufusi.timeclockfullstack.entities.Shift;
import com.rkaufusi.timeclockfullstack.entities.User;
import com.rkaufusi.timeclockfullstack.repositories.ShiftRepository;
import com.rkaufusi.timeclockfullstack.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShiftController {


    @Autowired
    private ShiftRepository shiftRepository;

    @PostMapping("/createShift")
    public Shift createShift(@RequestBody Shift shift){
        return shiftRepository.save(shift);
    }

}
