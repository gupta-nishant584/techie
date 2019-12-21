package com.example.entity;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


public class GenericDetails {

	public String emiCardNo;
	
	public String amount;
	
	public String bucketCode;
	
	public String customerName;
	
	public String customerEmail;
	
	public String customerMobile;
	
	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String customerCreateDate;
	
	
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerCreateDate() {
		return customerCreateDate;
	}

	public void setCustomerCreateDate(String customerCreateDate) {
		this.customerCreateDate = customerCreateDate;
	}


	public String getEmiCardNo() {
		return emiCardNo;
	}

	public void setEmiCardNo(String emiCardNo) {
		this.emiCardNo = emiCardNo;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBucketCode() {
		return bucketCode;
	}

	public void setBucketCode(String bucketCode) {
		this.bucketCode = bucketCode;
	}

	@Override
	public String toString() {
		return "GenericDetails [emiCardNo=" + emiCardNo + ", amount=" + amount + ", bucketCode=" + bucketCode
				+ ", customerName=" + customerName + ", customerEmail=" + customerEmail + ", customerCreateDate="
				+ customerCreateDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((bucketCode == null) ? 0 : bucketCode.hashCode());
		result = prime * result + ((customerCreateDate == null) ? 0 : customerCreateDate.hashCode());
		result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((emiCardNo == null) ? 0 : emiCardNo.hashCode());
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
		GenericDetails other = (GenericDetails) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (bucketCode == null) {
			if (other.bucketCode != null)
				return false;
		} else if (!bucketCode.equals(other.bucketCode))
			return false;
		if (customerCreateDate == null) {
			if (other.customerCreateDate != null)
				return false;
		} else if (!customerCreateDate.equals(other.customerCreateDate))
			return false;
		if (customerEmail == null) {
			if (other.customerEmail != null)
				return false;
		} else if (!customerEmail.equals(other.customerEmail))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (emiCardNo == null) {
			if (other.emiCardNo != null)
				return false;
		} else if (!emiCardNo.equals(other.emiCardNo))
			return false;
		return true;
	}

	
	
}
