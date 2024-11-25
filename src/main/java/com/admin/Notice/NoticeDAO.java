package com.admin.Notice;

import java.util.ArrayList;
import java.util.List;

import com.admin.Events.Event;

public interface NoticeDAO {
	
	public  List<Notice> getThreeNotices();
	
	public  List<Notice> getAllNotices();

}
