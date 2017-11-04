package jbr.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PARTS")
public class Parts {
	
	
	private int partid;
private String desofgood;
	
	private String partnumber;
	private String hsncode;
	private String partqty;
	private String partprice;
//	private int billid;
	//@ManyToOne
  
	//@JoinColumn(name="BILLID", nullable=false)
    
	private Bill bill;
	
	//@ManyToOne
    //@JoinColumn(name="BILLID", nullable=false)
	
	//@OneToMany(mappedBy="billid")
	@ManyToOne
    @JoinColumn(name="billid")
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="partid")
	public int getPartid() {
		return partid;
	}
	public void setPartid(int partid) {
		this.partid = partid;
	}
	@Column(name="partqty")
	public String getPartqty() {
		return partqty;
	}
	public void setPartqty(String partqty) {
		this.partqty = partqty;
	}
	@Column(name="partprice")
	public String getPartprice() {
		return partprice;
	}
	public void setPartprice(String partprice) {
		this.partprice = partprice;
	}
	@Column(name="partnumber")
	public String getPartnumber() {
		return partnumber;
	}
	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}
	@Column(name="hsncode")
	public String getHsncode() {
		return hsncode;
	}
	public void setHsncode(String hsncode) {
		this.hsncode = hsncode;
	}
	@Column(name="desofgood")
	public String getDesofgood() {
		return desofgood;
	}
	public void setDesofgood(String desofgood) {
		this.desofgood = desofgood;
	}
	/*@Column(name="billid")
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}*/
	
}
