package com.hospital.doctor;

import com.hospital.module.Doctor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("view")
    public String view(){
       Doctor doctor=new Doctor();
       doctor.setAddress("Doctor");
       doctor.setName("Pravat");
        return doctor.toString();
    }
}
