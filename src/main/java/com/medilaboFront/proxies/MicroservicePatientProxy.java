package com.medilaboFront.proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.medilaboFront.beans.PatientBean;

@FeignClient(name = "medilaboPatient", url = "localhost:8080")
public interface MicroservicePatientProxy {

	@GetMapping(value = "/patients/list")
	List<PatientBean> listeDesPatients();

	@GetMapping(value = "/patients/nom/{nom}")
	Optional<PatientBean> getPatient(@PathVariable("nom") String nom);

}
