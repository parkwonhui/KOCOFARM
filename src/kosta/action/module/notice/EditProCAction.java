package kosta.action.module.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.comm.ActionForward;
import kosta.action.comm.IAction;
import kosta.model.module.service.NoticeService;

public class EditProCAction implements IAction{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		NoticeService service = NoticeService.getInstance();
		
		/* 성공 여부 */
		int re = service.setUpNotice(request);
		request.setAttribute("re", re);
		
		forward.setRedirect(false);
		forward.setPath("/jsp/comm/proC.jsp");
		
		return forward;
	}

}