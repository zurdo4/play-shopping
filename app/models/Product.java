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

@Entity
public class Product extends Model {
	
	@Id
	@GeneratedValue
	@Column(name="idproduct")
	public Long idporduct;
	public String dsproduct;
	public String txproduct;
	
	
    public Long getId() {
        return idporduct;
    }

    @Override
    public Object _key() {
        return idporduct;
    }

    @ManyToMany
    @JoinTable(name="product_spec", joinColumns={ @JoinColumn(name= "idproduct") }, inverseJoinColumns={ @JoinColumn(name="idspec")})
    public Set<Spec> specs;
	
    @ManyToMany
    @JoinTable(name="product_category", joinColumns={ @JoinColumn(name= "idproduct") }, inverseJoinColumns={ @JoinColumn(name="idcategory")})
    public Set<Category> categories;
    
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="product_supplier", joinColumns={ @JoinColumn(name= "idproduct") }, inverseJoinColumns={ @JoinColumn(name="idsupplier")})
 	public Set<Supplier> suppliers;

    

}
