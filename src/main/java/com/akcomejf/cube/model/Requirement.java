package com.akcomejf.cube.model;

import java.util.Date;

import com.akcomejf.cube.framework.MyEntity;


public class Requirement extends MyEntity{
	
	private Integer id;
	
	private String name;
	
	private String content;
	
	private String proposePeople;
	
	private String pm;
	
	private Date createTime;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getProposePeople() {
		return proposePeople;
	}

	public void setProposePeople(String proposePeople) {
		this.proposePeople = proposePeople;
	}

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Requirement [id=" + id + ", name=" + name + ", content=" + content + ", proposePeople=" + proposePeople
				+ ", pm=" + pm + ", createTime=" + createTime + "]";
	}
	
	
}
