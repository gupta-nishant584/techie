package com.example.form;

import com.example.entity.Customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerForm {

	private String type;
    private Customer value;

    public CustomerForm() {
    	
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Customer getValue() {
		return value;
	}

	public void setValue(Customer value) {
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
