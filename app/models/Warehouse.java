package models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import models.Model;

@Entity
public class Warehouse extends Model {
	
	@Id
	@GeneratedValue
	@Column(name="idwarehouse")
	public Long idwarehouse;
	public String dswarehouse;
	public String txwarehouse;
	
	
	public String toString(){
		return dswarehouse;
	}
	
	@ManyToMany
	@JoinTable(name="sku_warehouse",joinColumns={@JoinColumn(name="idwarehouse")},inverseJoinColumns={@JoinColumn(name="idsku")})
	public Set<Sku> skus;
	
	public Long getId() {
		return idwarehouse;
	}

	public Object _key() {
		return idwarehouse;
	}

}
