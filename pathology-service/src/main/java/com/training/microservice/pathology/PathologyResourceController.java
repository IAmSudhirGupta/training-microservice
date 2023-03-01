package com.training.microservice.pathology;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathology")
public class PathologyResourceController {

	List<Disease> diseases = Arrays.asList(new Disease("D1", "Astma", "Take hot water bath"),
			new Disease("D2", "Malaria", "take bed rest and proper medicine"),
			new Disease("D3", "Corona", "Take Hot water and gargle"),
			new Disease("D4", "Viral fever", "Take rest and wear mask"));

	@RequestMapping("/diseases")
	public DiseaseList getEmployees() {
		DiseaseList diseaseList = new DiseaseList();
		diseaseList.setDiseaseList(diseases);
		return diseaseList;
	}

	@RequestMapping("/diseases/{id}")
	public Disease getEmployeeById(@PathVariable("id") String id) {
		Disease dis = diseases.stream().filter(d -> d.getId().equals(id)).findAny().orElse(null);
		return dis;
	}

}
