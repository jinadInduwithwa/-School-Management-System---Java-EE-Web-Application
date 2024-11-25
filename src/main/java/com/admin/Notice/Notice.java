package com.admin.Notice;

public class Notice {
	private int noticeId;
	private String noticeTitle;
	private String noticeDiscription;
	private String noticeGrade;
	private String noticePublishDate;
	
	public Notice(int noticeId, String noticeTitle, String noticeDiscription, String noticeGrade,
			String noticePublishDate) {
		super();
		this.noticeId = noticeId;
		this.noticeTitle = noticeTitle;
		this.noticeDiscription = noticeDiscription;
		this.noticeGrade = noticeGrade;
		this.noticePublishDate = noticePublishDate;
	}
	

	public Notice() {
		super();
	}


	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeDiscription() {
		return noticeDiscription;
	}

	public void setNoticeDiscription(String noticeDiscription) {
		this.noticeDiscription = noticeDiscription;
	}

	public String getNoticeGrade() {
		return noticeGrade;
	}

	public void setNoticeGrade(String noticeGrade) {
		this.noticeGrade = noticeGrade;
	}

	public String getNoticePublishDate() {
		return noticePublishDate;
	}

	public void setNoticePublishDate(String noticePublishDate) {
		this.noticePublishDate = noticePublishDate;
	}
	
	
	
	
}
