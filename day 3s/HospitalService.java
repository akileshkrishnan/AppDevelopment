package com.akilesh.hospital_management_system.Service;

	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akilesh.hospital_management_system.Entity.HospitalEntity;
import com.akilesh.hospital_management_system.Repositery.HospitalRepositery;

	@Service
	public class HospitalService 
	{

		@Autowired
		HospitalRepositery repository;
		
		public List<HospitalEntity> getAllBookmystay() {
			return repository.findAll();
		}
		
		public HospitalEntity getbookmystayById(Long HospitalEntityId) {
			Optional<HospitalEntity> bookmystayOptional = repository.findById(HospitalEntityId);
			return bookmystayOptional.orElse(null);
		}
		
		public HospitalEntity savebookmystay(HospitalEntity HospitalEntity) {
			return repository.save(HospitalEntity);
		}
		
		public void deletebookmystay(Long HospitalEntityId) {
			repository.deleteById(HospitalEntityId);
		}
	}

