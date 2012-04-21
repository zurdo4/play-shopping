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
import javax.persistence.OneToMany;

@Entity
public class Sku extends Model {
	
	@Id
	@GeneratedValue
	@Column(name="idsku")
	public Long idsku;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return idsku;
	}

	@Override
	public Object _key() {
		// TODO Auto-generated method stub
		return idsku;
	}
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idproduct")
	public Product product;
	
	
	public Double price;
	
	
    @ManyToMany
    @JoinTable(name="sku_value", joinColumns={ @JoinColumn(name= "idsku") }, inverseJoinColumns={ @JoinColumn(name="idvalue")})
    public Set<Value> values;
    
    
  
	@ManyToMany
	@JoinTable(name="sku_warehouse",joinColumns={@JoinColumn(name="idsku")},inverseJoinColumns={@JoinColumn(name="idwarehouse")})
	public Set<Warehouse> warehouses;
		


}
