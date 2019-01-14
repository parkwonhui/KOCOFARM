package kosta.controller.module;

import java.util.HashMap;
import java.util.Map;

import kosta.action.comm.IAction;
import kosta.action.module.schedule.CalenderWrite;
import kosta.action.module.schedule.ProjectBoardList;
import kosta.action.module.schedule.ProjectBoardRead;

public class ScheduleManager {
	
	Map<String, IAction> scheduleActionList;

	public ScheduleManager() {
		scheduleActionList = new HashMap<String, IAction>();
		scheduleActionList.put("schedule.do", new ProjectBoardList());
		scheduleActionList.put("projectBoardRead.do", new ProjectBoardRead());
		scheduleActionList.put("calenderWrite.do", new CalenderWrite());

	}
	
	public IAction getScheduleManager(String url){
		return scheduleActionList.get(url);
	}

}
