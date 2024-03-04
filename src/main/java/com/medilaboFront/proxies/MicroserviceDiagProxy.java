package com.medilaboFront.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "medilaboDiag", url = "localhost:8084")

public interface MicroserviceDiagProxy {

	@GetMapping("/diag/risque/{id}")
	public String getRisqueById(@PathVariable("id") Integer id);

	@GetMapping("/diag/risque/{name}")
	public String getRisqueByName(@PathVariable("name") String name);

}
