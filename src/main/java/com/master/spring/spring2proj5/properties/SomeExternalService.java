package com.master.spring.spring2proj5.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class SomeExternalService {

	@Value("${external.service.url}")
	private String serviceUrl;

	public String getServiceUrl() {
		return serviceUrl;
	}
}
