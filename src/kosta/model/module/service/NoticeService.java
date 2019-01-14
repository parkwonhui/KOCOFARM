package kosta.model.module.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kosta.model.module.dao.NoticeDao;
import kosta.model.module.vo.Notice;
import kosta.model.module.vo.NoticeListModel;
import kosta.model.module.vo.NoticeSearch;

public class NoticeService {
	private static NoticeDao dao;
	private static NoticeService noticeService = new NoticeService();
	private static final int PAGE_SIZE = 10;
	
	public static NoticeService getInstance(){
		dao = dao.getInstance();
		
		return noticeService;
	}
	
	/* 紐⑸줉 */
	public NoticeListModel getNoticeList(int requestPage, HttpServletRequest request)throws Exception{
		/* 寃��깋 */
		String schType = request.getParameter("schType");
		String schWord = request.getParameter("schWord");
		
		HttpSession session = request.getSession();
		NoticeSearch search = new NoticeSearch();
		
		if(schType != null && schWord != null){
			session.removeAttribute("search");
			search.setSchType(schType);
			search.setSchWord(schWord);
			session.setAttribute("search", search);
		}else if(null != (NoticeSearch)session.getAttribute("search")){
			search = (NoticeSearch)session.getAttribute("search");
		}
		
		/* �럹�씠吏� �꽕�씠�뀡 */
		// 珥� 湲� 媛� �닔
		int totalCount = dao.getNoticeListCnt(search);
		
		// 珥� �럹�씠吏� �닔
		int totalPageCount = totalCount/PAGE_SIZE;
		
		// 寃뚯떆 湲� �굹癒몄�
		if(totalCount%PAGE_SIZE > 0){
			totalPageCount++;
		}
		
		// �떆�옉 �럹�씠吏�, 留덉�留� �럹�씠吏�
		int startPage = requestPage - (requestPage-1)%PAGE_SIZE;
		int endPage = startPage+(PAGE_SIZE-1);
		
		if(endPage > totalPageCount){
			endPage = totalPageCount;
		}
		
		// �떆�옉 �뻾 援ы븯湲� : (�쁽�옱�럹�씠吏� -1) * �럹�씠吏� �떦 湲� 媛� �닔
		int startRow = (requestPage-1)*PAGE_SIZE;
		
		List<Notice> list = dao.getNoticeList(search, startRow);
		NoticeListModel listModel = new NoticeListModel(list, requestPage, totalPageCount, startPage, endPage);
		
		return listModel;
	}
	
	/* �긽�꽭�젙蹂� */
	public Notice getNotice(HttpServletRequest request)throws Exception{
		String noticeId = request.getParameter("noticeId") == null ? "" : request.getParameter("noticeId");
		Notice notice = dao.getNotice(noticeId);
		
		if("view".equals(request.getParameter("mode"))){
			/* 議고쉶 �닔 利앷� */
			int hitCnt = notice.getHitCnt()+1;
			notice.setHitCnt(hitCnt);
			dao.setUpHitCnt(notice);
			
			/* 移섑솚 */
			String contentsVw = notice.getContents().replaceAll("\r\n", "<br/>");
			notice.setContents(contentsVw);
		}
		
		return notice;
	}
	
	/* �벑濡� */
	public int setNotice(HttpServletRequest request)throws Exception{
		/* �뙆�씪 �뾽濡쒕뱶(寃쎈줈, �뙆�씪�겕湲�, �씤肄붾뵫, �뙆�씪 �씠由� 以묒꺽 �젙梨�) */
		String uploadPath = request.getRealPath("upload");
		int size = 20 * 1024 * 1024; // 20MB
		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "UTF-8", new DefaultFileRenamePolicy());
		
		Notice notice = new Notice();
		notice.setTitle(multi.getParameter("title"));
		notice.setContents(multi.getParameter("contents"));
		
		// �뙆�씪 �뾽濡쒕뱶
		if(multi.getFilesystemName("fileNm") != null){
			String fileNm = multi.getFilesystemName("fileNm");
			notice.setFileNm(fileNm);
		}else{
			notice.setFileNm("");
		}
		
		int re = dao.setNotice(notice);
		
		return re;
	}
	
	/* �닔�젙 */
	public int setUpNotice(HttpServletRequest request)throws Exception{
		/* �뙆�씪 �뾽濡쒕뱶(寃쎈줈, �뙆�씪�겕湲�, �씤肄붾뵫, �뙆�씪 �씠由� 以묒꺽 �젙梨�) */
		String uploadPath = request.getRealPath("upload");
		int size = 20 * 1024 * 1024; // 20MB
		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "UTF-8", new DefaultFileRenamePolicy());
		
		Notice notice = new Notice();
		notice.setTitle(multi.getParameter("title"));
		notice.setContents(multi.getParameter("contents"));
		notice.setNoticeId(multi.getParameter("noticeId"));
		
		// �뙆�씪 �뾽濡쒕뱶
		if(multi.getFilesystemName("fileNm") != null){
			String fileNm = multi.getFilesystemName("fileNm");
			notice.setFileNm(fileNm);
		}else{
			notice.setFileNm("");
		}
		
		int re = dao.setUpNotice(notice);
		
		return re;
	}
	
	/* �궘�젣 */
	public int delNotice(HttpServletRequest request)throws Exception{
		String noticeId = request.getParameter("noticeId") == null ? "" : request.getParameter("noticeId");
		
		int re = dao.delNotice(noticeId);
		
		return re;
	}
}