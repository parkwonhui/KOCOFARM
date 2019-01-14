package kosta.action.module.approval;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.comm.ActionForward;
import kosta.action.comm.IAction;
import kosta.model.module.dao.ApprovalDao;
import kosta.model.module.vo.ApprovalDraft;

public class InsertDraftAction implements IAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ApprovalDao apprdao = ApprovalDao.getInstance();
		ApprovalDraft draft = new ApprovalDraft();
		
		draft.setDraftTitle(request.getParameter("draft_title"));
		draft.setDraftName(request.getParameter("draft_name"));
		draft.setDraftYear(Integer.parseInt(request.getParameter("draft_year")));
		
		apprdao.insertDraft(draft);
		
		forward.setRedirect(false);
		forward.setPath("/jsp/module/approval/list.jsp");
		
		return forward;
	}

}
