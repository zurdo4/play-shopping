package models;

import play.data.validation.Email;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends Model {
	
	public String email;
	public String username;
	public String password;
	
	
	
	


}
