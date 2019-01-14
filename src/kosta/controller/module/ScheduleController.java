package kosta.controller.module;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.action.comm.ActionForward;
import kosta.action.comm.IAction;
import kosta.action.module.schedule.ProjectBoardList;

@WebServlet("/schedule/*")
public class ScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
	ScheduleManager scheduleManager;
    public ScheduleController() {
        super();
     
        scheduleManager = new ScheduleManager();
    }

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String schedule = "schedule";					// WebSesrvlet �씠由�
		String command = requestURI.substring(contextPath.length()+1+schedule.length()+1);
		System.out.println("command:"+requestURI);
		System.out.println("command:"+contextPath);
		System.out.println("command:"+command);

		IAction action = null;
		ActionForward forward = null;
		action = scheduleManager.getScheduleManager(command);

		try {
			
			forward = action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
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
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
