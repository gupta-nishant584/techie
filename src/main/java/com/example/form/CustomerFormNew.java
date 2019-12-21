package com.example.form;

import java.util.List;

import com.example.entity.Customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerFormNew {

	private String type;
    private List<Customer> value;

    public CustomerFormNew() {
    	
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

		
	public List<Customer> getValue() {
		return value;
	}

	public void setValue(List<Customer> value) {
		this.value = value;
	}

	@Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
    
    
}
