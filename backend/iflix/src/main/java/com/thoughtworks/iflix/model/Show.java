package com.thoughtworks.iflix.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="show.")
public class Show 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="showid")
	private int Id;
	
	@Column(name="showname")
	private String showname;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="comments")
	private String Comments;
	
	@OneToMany(mappedBy="show", cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<Venue> venues;
	
	public Show( String showname, String rating, String comments) {
		this.showname = showname;
		this.rating = rating;
		this.Comments = comments;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getShowname() {
		return showname;
	}

	public void setShowname(String showname) {
		this.showname = showname;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public List<Venue> getVenues() {
		return venues;
	}

	public void setVenues(List<Venue> venues) {
		this.venues = venues;
	}

	@Override
	public String toString() {
		return "Show [Id=" + Id + ", showname=" + showname + ", rating=" + rating + ", Comments=" + Comments
				+ ", venues=" + venues + "]";
	}

	

}
