package kosta.action.module.approval;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.comm.ActionForward;
import kosta.action.comm.IAction;
import kosta.model.module.dao.ApprovalDao;
import kosta.model.module.vo.ApprovalExpence;


public class InsertExpence implements IAction {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApprovalDao dao = ApprovalDao.getInstance();

		request.setCharacterEncoding("utf-8");

		ApprovalExpence approvalE = new ApprovalExpence();

		approvalE.setForm_id(Integer.parseInt(request.getParameter("form_id")));
		approvalE.setExpence_type(request.getParameter("expence_type"));
		approvalE.setCustomer_name(request.getParameter("customer_name"));
		approvalE.setExpence_price(request.getParameter("expence_price"));
		approvalE.setCommission_option(request.getParameter("commission_option"));
		approvalE.setCommission_price(request.getParameter("commission_price"));
		approvalE.setSum_price(request.getParameter("sum_price"));

		dao.insertExpence(approvalE);

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/jsp/module/approval/list.jsp");

		return forward;

	}

}
