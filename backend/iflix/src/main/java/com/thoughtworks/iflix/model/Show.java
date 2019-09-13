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
	private int rating;
	
	@Column(name="comments")
	private String Comments;
	
	@OneToMany(mappedBy="show", cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<Venue> venues;

	public int getId() {
		return Id;
	}

	public void setShowId(int showId) {
		this.Id = showId;
	}

//	public String getShowname() {
//		return showname;
//	}
//
//	public void setShowname(String showName) {
//		this.showname = showName;
//	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}
	
}
