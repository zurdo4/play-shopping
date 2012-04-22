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
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Spec extends Model {

	@Id
	@GeneratedValue
	@Column(name = "idspec")
	public Long idspec;
	public String dsspec;
	public String txspec;
	
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="idspec")
	@OrderBy("dsvalue")
	public Set<Value> values;

	@Override
	public Long getId() {
		return idspec;
	}

	@Override
	public Object _key() {
		return idspec;
	}
	
	public String toString(){
		return dsspec;
	}
	
	/*
    @ManyToMany
    @JoinTable(name="product_spec", joinColumns={ @JoinColumn(name= "idspec") }, inverseJoinColumns={ @JoinColumn(name="idproduct")})
    public Set<Spec> specs;
		*/

}
