package com.akilesh.hospital_management_system.Controller;

	import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akilesh.hospital_management_system.Entity.HospitalEntity;
import com.akilesh.hospital_management_system.Service.HospitalService;


@CrossOrigin("*")
@RestController
@RequestMapping("/Hospital")
public class Controller 
{ 

    @Autowired
    private HospitalService service;
    @GetMapping(value="/get")
    public Iterable<HospitalEntity> getAllHospitalEntity(){
        return service.getAllhospitalEntity ();
    }
    	
   
    @PostMapping("/post")
    public HospitalEntity createtata(@RequestBody HospitalEntity ad) {
        return service.savehospitalEntity (ad);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<HospitalEntity>> getById(@PathVariable  Long id){
        Optional<HospitalEntity> ac = Optional.of(service.gethospitalEntityById(id));
        return ResponseEntity.ok(ac);
    }

    @PutMapping("/update/{id}")
	public HospitalEntity updateBookmystayDetails(@RequestBody HospitalEntity b,@PathVariable Long id)
	{
		System.out.println("Changes Made Have Been Successfully Updated");
		
		b.setid(id);
		return service.savehospitalEntity (b);		
	}
    @DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable Long id)
	{
    	service.deletehospitalEntity (id);
		return null;
	}
}

