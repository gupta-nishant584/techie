package com.example.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="CUSTOMER")
public class Customer {

    /*@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CUSTOMER_SEQ_VAL")
    @SequenceGenerator(name="CUSTOMER_SEQ_VAL",sequenceName="CUSTOMER_SEQ",allocationSize=1)
    @Column(name="ID")
    int id;*/
    
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID",strategy="org.hibernate.id.UUIDGenerator")
	
	@Column(name="ID",updatable = false, nullable = false)
	private UUID id;
	

	@Column(name="NAME")
    String name;
    
    @Column(name="EMAIL")
    String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    Date date;
    
    @Column(name="MOBILE")
    String mobile;
    
    @Column(name="EMI_CARD_NO")
    String emiCardNo;
    

    public Customer(String name, String email, Date date) {
        this.name = name;
        this.email = email;
        this.date = date;
    }

    public Customer(UUID id, String name, String email, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.date = date;
	}
    
    public Customer(String name, String email, Date date, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.date = date;
		this.mobile = mobile;
	}

	public Customer() {
    }

    public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmiCardNo() {
		return emiCardNo;
	}

	public void setEmiCardNo(String emiCardNo) {
		this.emiCardNo = emiCardNo;
	}

   /* public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", date=" + date + ", mobile=" + mobile
				+ ", emiCardNo=" + emiCardNo + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (emiCardNo == null) {
			if (other.emiCardNo != null)
				return false;
		} else if (!emiCardNo.equals(other.emiCardNo))
			return false;
		if (id != other.id)
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
    
}
