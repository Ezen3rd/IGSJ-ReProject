package ezen.project.IGSJ.review.domain;

import java.util.Date;

public class ReviewDTO {
	/* 
		rvno : 리뷰번호
		pno : 제품번호
		rvContent : 리뷰내용
		userId : 유저아이디
		-> rvWriter : 리뷰작성자 이거말고 유저아이디가 들어가야 되는듯?
		rvRegDate : 리뷰작성일자
	*/
	
	private int rvno;
	private int pno;
	private String rvContent;
	private String userId;
	private Date rvRegDate;
	
	public int getRvno() {
		return rvno;
	}
	public void setRvno(int rvno) {
		this.rvno = rvno;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getRvContent() {
		return rvContent;
	}
	public void setRvContent(String rvContent) {
		this.rvContent = rvContent;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getRvRegDate() {
		return rvRegDate;
	}
	public void setRvRegDate(Date rvRegDate) {
		this.rvRegDate = rvRegDate;
	}
	@Override
	public String toString() {
		return "ReviewDTO [rvno=" + rvno + ", pno=" + pno + ", rvContent=" + rvContent + ", userId=" + userId
				+ ", rvRegDate=" + rvRegDate + "]";
	}
	
	
	
	
}
