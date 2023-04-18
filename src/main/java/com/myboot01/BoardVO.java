package com.myboot01;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter //Getter 메소드를 만듬
@Setter //Setter 메소드를 만듬
@ToString //모든 멤버변수의 값을 문자열로 연결해 리턴한다.
public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;

	private MultipartFile uploadFile;
	
	private String searchCondition;
	private String searchKeyword;
	

//	public int getSeq() {
//		return seq;
//	}
//
//	public String getSearchCondition() {
//		return searchCondition;
//	}
//
//	public void setSearchCondition(String searchCondition) {
//		this.searchCondition = searchCondition;
//	}
//
//	public String getSearchKeyword() {
//		return searchKeyword;
//	}
//
//	public void setSearchKeyword(String searchKeyword) {
//		this.searchKeyword = searchKeyword;
//	}
//
//	public void setSeq(int seq) {
//		this.seq = seq;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getWriter() {
//		return writer;
//	}
//
//	public void setWriter(String writer) {
//		this.writer = writer;
//	}
//
//	public String getContent() {
//		return content;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}
//
//	public Date getRegDate() {
//		return regDate;
//	}
//
//	public void setRegDate(Date regDate) {
//		this.regDate = regDate;
//	}
//
//	public int getCnt() {
//		return cnt;
//	}
//
//	public void setCnt(int cnt) {
//		this.cnt = cnt;
//	}
//	
//
//	public MultipartFile getUploadFile() {
//		return uploadFile;
//	}
//
//	public void setUploadFile(MultipartFile uploadFile) {
//		this.uploadFile = uploadFile;
//	}

//	@Override
//	public String toString() {
//		return "BoardVO [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
//				+ regDate + ", cnt=" + cnt + "]";
//	}
}