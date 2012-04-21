package models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Supplier extends Model {
	
	@Id
	@GeneratedValue
	@Column(name="idsupplier")
	public Long idsupplier;
	public String dssupplier;
	public String txsupplier;
	
    @ManyToMany
    @JoinTable(name="product_supplier", joinColumns={ @JoinColumn(name= "idsupplier") }, inverseJoinColumns={ @JoinColumn(name="idproduct")})
 	public Set<Product> products;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return idsupplier;
	}

	@Override
	public Object _key() {
		// TODO Auto-generated method stub
		return idsupplier;
	}
	
	
	public String toString(){
		return dssupplier;
	}

}
