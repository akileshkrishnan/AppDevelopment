package com.akilesh.hospital_management_system.Repositery;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.akilesh.hospital_management_system.Entity.HospitalEntity;


public interface HospitalRepositery extends JpaRepository<HospitalEntity,Long> {

	

}


