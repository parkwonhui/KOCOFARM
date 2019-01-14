package kosta.action.module.schedule;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.comm.ActionForward;
import kosta.action.comm.IAction;
import kosta.model.module.dao.ScheduleDao;
import kosta.model.module.vo.ScheduleProject;

public class CalenderWrite implements IAction{

	public CalenderWrite(){}
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		
		ActionForward forward = new ActionForward();
		
		ScheduleDao dao = ScheduleDao.getInstance();
		

		forward.setRedirect(false);
		forward.setPath("/jsp/module/schedule/list.jsp");
		
		return forward;
	}	
}
