package kosta.controller.module;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.comm.IAction;
import kosta.action.comm.ActionForward;
import kosta.action.module.approval.InsertDraftAction;


@WebServlet("*.do")
public class ApprovalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ApprovalController() {
        super();
    }

    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	
    	String requestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+1);
    	System.out.println(command);
    	
    	IAction action = null;
    	ActionForward forward = null;
    	
    	/* 기안서 입력 */
    	if(command.equals("apprInsertDraft.do")){
    		action = new InsertDraftAction(); //액션 생성->호출
    		try {
				forward = action.execute(request, response); 
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	
    	if(forward != null){
			if(forward.isRedirect()){
				response.sendRedirect(forward.getPath());
			}else{
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
