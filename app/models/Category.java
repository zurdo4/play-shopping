package models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Category extends Model {
	
	@Id
    @GeneratedValue
	@Column(name="idcategory")
	public Long idcategory;
	public String dscategory;
	public String txcategory;
	
    public Long getId() {
        return idcategory;
    }
    
    public String toString(){
    	return dscategory;
    }

    @Override
    public Object _key() {
        return idcategory;
    }

    
    @ManyToMany
    @JoinTable(name="product_category", joinColumns={ @JoinColumn(name= "idcategory") }, inverseJoinColumns={ @JoinColumn(name="idproduct")})
    public Set<Product> products;
	

}
