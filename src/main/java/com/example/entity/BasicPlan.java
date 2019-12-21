package com.example.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement
@Entity
@Table(name="EMICARD_BASIC_PLAN")
//@JsonInclude(JsonInclude.Include.NON_NULL) //we can use this annotation to not show null fields in response
public class BasicPlan {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonIgnore    //use this annotation to ignore the field not required in response. 
	public Long id;
	
	@Column(name="PLAN_NAME")
	public String planName;
	
	@Column(name="CODE")
	public String code;
	
	@Column(name="NO_OF_INSTALLMENTS")
	public String noOfInstallments;
	
	@Column(name="MIN_LIMIT")
	public Double minLimit;
	
	@Column(name="MAX_LIMIT")
	public Double maxLimit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNoOfInstallments() {
		return noOfInstallments;
	}

	public void setNoOfInstallments(String noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}

	public Double getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(Double minLimit) {
		this.minLimit = minLimit;
	}

	public Double getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(Double maxLimit) {
		this.maxLimit = maxLimit;
	}

	@Override
	public String toString() {
		return "BasicPlan [id=" + id + ", planName=" + planName + ", code=" + code + ", noOfInstallments="
				+ noOfInstallments + ", minLimit=" + minLimit + ", maxLimit=" + maxLimit + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((maxLimit == null) ? 0 : maxLimit.hashCode());
		result = prime * result + ((minLimit == null) ? 0 : minLimit.hashCode());
		result = prime * result + ((noOfInstallments == null) ? 0 : noOfInstallments.hashCode());
		result = prime * result + ((planName == null) ? 0 : planName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicPlan other = (BasicPlan) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (maxLimit == null) {
			if (other.maxLimit != null)
				return false;
		} else if (!maxLimit.equals(other.maxLimit))
			return false;
		if (minLimit == null) {
			if (other.minLimit != null)
				return false;
		} else if (!minLimit.equals(other.minLimit))
			return false;
		if (noOfInstallments == null) {
			if (other.noOfInstallments != null)
				return false;
		} else if (!noOfInstallments.equals(other.noOfInstallments))
			return false;
		if (planName == null) {
			if (other.planName != null)
				return false;
		} else if (!planName.equals(other.planName))
			return false;
		return true;
	}
	
	
	
}
