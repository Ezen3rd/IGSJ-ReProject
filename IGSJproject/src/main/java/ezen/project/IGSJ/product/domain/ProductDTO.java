package ezen.project.IGSJ.product.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ProductDTO {
	
	private String pno;									// 제품번호
	private int cno;										// 카테고리 번호
	private String product_name;				// 제품이름
	private int product_price;						// 제품가격
	private int product_stock;					// 제품재고
	private String product_description;		// 제품설명
	private Date product_regDate;			// 제품등록일자
	private String userId;								// 제품등록자
	
	
	public ProductDTO(String pno, int cno, String product_name, int product_price, int product_stock,
			String product_description, Date product_regDate, String userId) {
		this.pno = pno;
		this.cno = cno;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_stock = product_stock;
		this.product_description = product_description;
		this.product_regDate = product_regDate;
		this.userId = userId;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public Date getProduct_regDate() {
		return product_regDate;
	}
	public void setProduct_regDate(Date product_regDate) {
		this.product_regDate = product_regDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "ProductDTO [pno=" + pno + ", cno=" + cno + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_stock=" + product_stock + ", product_description=" + product_description
				+ ", product_regDate=" + product_regDate + ", userId=" + userId + "]";
	}
	
	
}