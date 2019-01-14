package kosta.action.module.approval;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.comm.ActionForward;
import kosta.action.comm.IAction;

public class InsertDraftAction implements IAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		forward.setPath("/jsp/module/approval/vacationForm.jsp");
		
		return forward;
	}

}
