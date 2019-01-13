package kosta.action.module.schedule;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.comm.ActionForward;
import kosta.action.comm.IAction;
import kosta.model.module.dao.schedule.ScheduleDao;
import kosta.model.module.vo.schedule.Calender;
import kosta.model.module.vo.schedule.Category;

public class ProjectBoardRead implements IAction{

	public ProjectBoardRead() {}
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		String strProjectId = request.getParameter("project_id");
		int projectId = Integer.parseInt(strProjectId);
		
		ActionForward forward = new ActionForward();
		ScheduleDao dao = ScheduleDao.getInstance();
		List<Category> categoryList = dao.listCategory(projectId);
		List<Calender> calenderList = dao.listCalender(projectId);
		
		System.out.println(categoryList);
		System.out.println(calenderList);
		
		request.setAttribute("categoryList", categoryList);	
		request.setAttribute("calenderList", calenderList);
		
		forward.setRedirect(false);
		forward.setPath("/jsp/module/schedule/project.jsp");
		
		return forward;
	}

}
