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
import javax.persistence.ManyToOne;


@Entity
public class Value extends Model {
	
	@Id
	@GeneratedValue
	@Column(name="idvalue")
	public Long idvalue;
	
	public String dsvalue;
	public String txvalue;
	
	/*
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idspec")
	public Spec spec;
	*/
	
	@Override
	public Long getId() {
		return idvalue;
	}
	@Override
	public Object _key() {
		return idvalue;
	}
	
	public String toString(){
		return dsvalue;
	}

	
	/*
    @ManyToMany
    @JoinTable(name="sku_value", joinColumns={ @JoinColumn(name= "idvalue") }, inverseJoinColumns={ @JoinColumn(name="idsku")})
    public Set<Sku> skus;
		*/
	
	
	
}
