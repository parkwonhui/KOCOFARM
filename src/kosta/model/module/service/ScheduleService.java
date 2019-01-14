package kosta.model.module.service;

import javax.servlet.http.HttpServletRequest;

import kosta.model.module.dao.ScheduleDao;
import kosta.model.module.vo.ScheduleCalender;

public class ScheduleService {
	private static ScheduleDao dao;
	private static ScheduleService scheduleService = new ScheduleService();

	public static ScheduleService getInstance(){
		dao = ScheduleDao.getInstance();
		return scheduleService;
	}
	
	public int insertScheduleCalender(HttpServletRequest request) {
		
		ScheduleCalender scheduleCalender = new ScheduleCalender();
		String project_id = request.getParameter("project_id");
		String category_id = request.getParameter("category_id");
		String write =  request.getParameter("write");
		String color = request.getParameter("color");
		String completion_per = request.getParameter("completion_per");
		String tag = request.getParameter("tag");
		
		int categoryId = Integer.parseInt(category_id);
		int completionPer = Integer.parseInt(completion_per);
		
		scheduleCalender.setCategory_id(categoryId);
		scheduleCalender.setTitle(write);
		scheduleCalender.setBackground_color(color);
		scheduleCalender.setCompletion_per(completionPer);
		scheduleCalender.setStart_dt("");
		scheduleCalender.setEnd_dt("");
		scheduleCalender.setTag_id(0);
		scheduleCalender.setY_pos(9);		// y개수를 알아야한다

			
		int re = dao.insertCelender(scheduleCalender);
		return re;
	}
}
