package kosta.model.module.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosta.mapper.NoticeMapper;
import kosta.model.module.vo.Notice;
import kosta.model.module.vo.NoticeSearch;

public class NoticeDao {
	
	public static NoticeDao noticeDao = new NoticeDao();
	
	public static NoticeDao getInstance(){
		return noticeDao;
	}
	
	/* MyBatis 연결 */
	public SqlSessionFactory getSqlSessionFactory(){
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	}

	/* 목록 총 개 수 */
	public int getNoticeListCnt(NoticeSearch search){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = 0;
		
		try {
			re = sqlSession.getMapper(NoticeMapper.class).getNoticeListCnt(search);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return re;
	}
		
	/* 목록 */
	public List<Notice> getNoticeList(NoticeSearch search, int startRow){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Notice> list = null;
		
		try {
			list = sqlSession.getMapper(NoticeMapper.class).getNoticeList(new RowBounds(startRow, 10), search);
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return list;
	}
	
	/* 상세 정보 */
	public Notice getNotice(String noticeId){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Notice notice = null;
		
		try{
			notice = sqlSession.getMapper(NoticeMapper.class).getNotice(noticeId);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return notice;
	}
	
	/* 조회 수 증가 */
	public int setUpHitCnt(Notice notice){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();

		try{
			re = sqlSession.getMapper(NoticeMapper.class).setUpHitCnt(notice);
			
			if(0 < re){
				sqlSession.commit();
			}else{
				sqlSession.rollback();
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return re;
	}
	
	/* 등록 */
	public int setNotice(Notice notice){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();

		try{
			re = sqlSession.getMapper(NoticeMapper.class).setNotice(notice);
			
			if(0 < re){
				sqlSession.commit();
			}else{
				sqlSession.rollback();
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return re;
	}
	
	/* 수정 */
	public int setUpNotice(Notice notice){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try{
			re = sqlSession.getMapper(NoticeMapper.class).setUpNotice(notice);
			
			try {
				if(0 < re){
					sqlSession.commit();
				}else{
					sqlSession.rollback();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return re;
	}
	
	/* 삭제 */
	public int delNotice(String noticeId){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try{
			re = sqlSession.getMapper(NoticeMapper.class).delNotice(noticeId);
			
			try{
				if(0 < re){
					sqlSession.commit();
				}else{
					sqlSession.rollback();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return re;
	}
}