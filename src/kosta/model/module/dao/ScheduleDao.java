package kosta.model.module.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta.mapper.ScheduleMapper;
import kosta.model.module.vo.ScheduleCalender;
import kosta.model.module.vo.ScheduleCategory;
import kosta.model.module.vo.ScheduleEmployee;
import kosta.model.module.vo.ScheduleProject;
import sun.security.jca.GetInstance;

import org.apache.ibatis.io.Resources;

public class ScheduleDao {
	private static ScheduleDao dao;

	static {
		dao = new ScheduleDao();
	}
	
	public static ScheduleDao getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFaction() {
		String resource = "mybatis-config.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public List<ScheduleEmployee> listEmployee() {
		SqlSession sqlSession = getSqlSessionFaction().openSession();
		List<ScheduleEmployee> list = sqlSession.getMapper(ScheduleMapper.class).listEmployee();
		return list;
	}

	public List<ScheduleProject> listProject() {
		SqlSession sqlSession = getSqlSessionFaction().openSession();
		List<ScheduleProject> list = sqlSession.getMapper(ScheduleMapper.class).listProject();
		return list;	
	}

	public List<ScheduleCategory> listCategory(int projectId){
		SqlSession sqlSession = getSqlSessionFaction().openSession();
		List<ScheduleCategory> list = sqlSession.getMapper(ScheduleMapper.class).listCategory(projectId);
		return list;
	}

	public List<ScheduleCalender> listCalender(int projectId) {
		SqlSession sqlSession = getSqlSessionFaction().openSession();
		List<ScheduleCalender> list = sqlSession.getMapper(ScheduleMapper.class).listCalender(projectId);
		return list;
	}
	
	public void insertCelender(ScheduleCalender cheduleCalender){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFaction().openSession();
		try{
			re = sqlSession.getMapper(ScheduleMapper.class).insertCelender(cheduleCalender);
			if(re > 0){
				sqlSession.commit();
			}else{
				sqlSession.rollback();				
			}
		}catch (Exception e) {
			e.printStackTrace();
	
		}finally{
			sqlSession.close();
		}
	}
}
