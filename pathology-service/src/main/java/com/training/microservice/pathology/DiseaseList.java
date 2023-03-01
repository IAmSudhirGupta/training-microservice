package com.training.microservice.pathology;

import java.util.ArrayList;
import java.util.List;

public class DiseaseList {

		private List<Disease> diseases = new ArrayList<>();

		public List<Disease> getDiseaseList() {
			return diseases;
		}

		public void setDiseaseList(List<Disease> diseases) {
			this.diseases = diseases;
		}
		public DiseaseList() {
			
		}
		public DiseaseList(List<Disease> diseases) {
			super();
			this.diseases = diseases;
		}
		
}
