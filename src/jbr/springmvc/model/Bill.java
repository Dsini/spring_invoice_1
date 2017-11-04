package jbr.springmvc.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
@Table(name="BILL")
public class Bill {
	
	private int billid;
	
	private String customername;
	private String customeraddress;
	private String customergsttin;
	private String pono;
	private String podate;
	
	private String labour;
	//@Autowired
	//Parts part;

private String labourname;
private String labourdescription;
private String labourprice;
//@Autowired
//private   Parts parts;
//@ElementCollection(targetClass=jbr.springmvc.model.Parts.class)
private List<Parts> partslist;


@Id
@GeneratedValue(strategy=GenerationType.AUTO)
   @Column(name="billid")
public int getBillid() {
	return billid;
}
public void setBillid(int billid) {
	this.billid = billid;
}
@Column(name="labourname")
public String getLabourname() {
	return labourname;
}
public void setLabourname(String labourname) {
	this.labourname = labourname;
}
@Column(name="labourdescription")
public String getLabourdescription() {
	return labourdescription;
}
public void setLabourdescription(String labourdescription) {
	this.labourdescription = labourdescription;
}
@Column(name="labourprice")
public String getLabourprice() {
	return labourprice;
}
public void setLabourprice(String labourprice) {
	this.labourprice = labourprice;
}
@Column(name="customername")
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
@Column(name="customeraddress")
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
@Column(name="customergsttin")
	public String getCustomergsttin() {
		return customergsttin;
	}
	public void setCustomergsttin(String customergsttin) {
		this.customergsttin = customergsttin;
	}
@Column(name="pono")
	public String getPono() {
		return pono;
	}
	public void setPono(String pono) {
		this.pono = pono;
	}
@Column(name="podate")
	public String getPodate() {
		return podate;
	}
	public void setPodate(String podate) {
		this.podate = podate;
	}
@Column(name="labour")
	public String getLabour() {
		return labour;
	}
	public void setLabour(String labour) {
		this.labour = labour;
	}
	//@ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name = "BILLID", nullable = false,referencedColumnName="BILLID")
/*@Transient
	public Parts getPart() {
		return part;
	}
	public void setPart(Parts part) {
		this.part = part;
	}*/
	//@OneToMany(mappedBy="billid", cascade=CascadeType.ALL)
	@OneToMany(mappedBy="bill",orphanRemoval=true,cascade=CascadeType.ALL,fetch = FetchType.LAZY)
   
	public List<Parts> getPartslist() {
		return partslist;
		
	}
	public void setPartslist(List<Parts> partslist) {
		this.partslist = partslist;
	}
	
	
	
	
}
