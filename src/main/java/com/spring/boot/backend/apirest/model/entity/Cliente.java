package com.spring.boot.backend.apirest.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stationcode;
	
	
	@Column(nullable = false)
	private String lanecode;
	
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date transactiondate ;
	
	
	@JsonFormat(pattern="HH:mm:ss")
	@Temporal(TemporalType.TIME)
	private Date transactionhour ;
	
	@Column(nullable = false)
	private String imagestype ;
	
	private String foto;

	
	@PrePersist
	public void prePersist() {
		transactiondate = new Date();
	}
	





	public Long getStationcode() {
		return stationcode;
	}








	public void setStationcode(Long stationcode) {
		this.stationcode = stationcode;
	}








	public String getLanecode() {
		return lanecode;
	}








	public void setLanecode(String lanecode) {
		this.lanecode = lanecode;
	}








	public Date getTransactiondate() {
		return transactiondate;
	}








	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}








	public Date getTransactionhour() {
		return transactionhour;
	}








	public void setTransactionhour(Date transactionhour) {
		this.transactionhour = transactionhour;
	}








	public String getImagestype() {
		return imagestype;
	}








	public void setImagestype(String imagestype) {
		this.imagestype = imagestype;
	}








	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}



	private static final long serialVersionUID = 1L;

}
