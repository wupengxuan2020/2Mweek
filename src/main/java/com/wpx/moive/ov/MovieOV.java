package com.wpx.moive.ov;

import com.wpx.moive.domain.Movie;

public class MovieOV extends Movie{
	private Integer pageNum;
	
	
	private Double p1;//��ʼ�۸�
	private Double p2;//�����۸�
	
	private Integer l1;
	private Integer l2;
	
	private String t1;
	private String t2;
	
	private String orderName;
	private String orderM;
	
	
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
	public Integer getL1() {
		return l1;
	}
	public void setL1(Integer l1) {
		this.l1 = l1;
	}
	public Integer getL2() {
		return l2;
	}
	public void setL2(Integer l2) {
		this.l2 = l2;
	}
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderM() {
		return orderM;
	}
	public void setOrderM(String orderM) {
		this.orderM = orderM;
	}
	
	
	
}
