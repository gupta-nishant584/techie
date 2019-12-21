package com.example.common;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:query.properties")
@ConfigurationProperties(prefix = "query")
public class QueryProperties {

	
	private String queryForFindAll;
	
	private List<String> listProperty;
	private Map<String, String> mapProperty;
	
	
	
	public String getQueryForFindAll() {
		return queryForFindAll;
	}
	public void setQueryForFindAll(String queryForFindAll) {
		this.queryForFindAll = queryForFindAll;
	}
	public List<String> getListProperty() {
		return listProperty;
	}
	public void setListProperty(List<String> listProperty) {
		this.listProperty = listProperty;
	}
	public Map<String, String> getMapProperty() {
		return mapProperty;
	}
	public void setMapProperty(Map<String, String> mapProperty) {
		this.mapProperty = mapProperty;
	}
  

}