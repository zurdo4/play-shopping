package models;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.jpa.GenericModel;

public abstract class Model 
	 extends GenericModel {


		    public abstract Long getId();

		    @Override
		    public abstract Object _key();
		    
		    /*
		    public Integer active;
		    public Long	modifiedby;
		    public Long createdby;
		    public Date modified;
		    public Date created;
	*/
}
