package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Tweet extends Model
{
	public String content;
	public Date postedAt;
	public User user;

}
