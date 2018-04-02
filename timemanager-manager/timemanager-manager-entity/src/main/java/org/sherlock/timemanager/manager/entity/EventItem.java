package org.sherlock.timemanager.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event_item")
public class EventItem {
	@Id
	private long id;
	
	@Column
	private String year;
	
	@Column
	private Month month;
	
	@Column
	private ClassGroup classGroup;
	
	@Column
	private DetailItem detailItem;
	
	@Column
	private User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public ClassGroup getClassGroup() {
		return classGroup;
	}

	public void setClassGroup(ClassGroup classGroup) {
		this.classGroup = classGroup;
	}

	public DetailItem getDetailItem() {
		return detailItem;
	}

	public void setDetailItem(DetailItem detailItem) {
		this.detailItem = detailItem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
