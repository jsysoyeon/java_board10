package Board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Collections;
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
import java.util.Date;
import java.util.Scanner;

public class App {

	ArticleDao dao = new ArticleDao();
	MemberManage mm = new MemberManage();
<<<<<<< HEAD
	LikeDao ld = new LikeDao();
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
	
	void print(ArrayList<Article> articles) {
		
		for(int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			System.out.println("");
			System.out.println("번호 : " + article.getId());
    		System.out.println("제목 : " + article.getTitle());
    		System.out.println("내용 : " + article.getBody());
    		System.out.println("작성자 : " + article.getWriter());
    		System.out.println("작성일 : " + article.getRegDate());
<<<<<<< HEAD
			System.out.println("조회수 : " + article.getViewsmanage());
			System.out.println("좋아요 : " + article.getLikemanage() + " / 싫어요 : " + article.getUnlikemanage());
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
    		System.out.println("");
		}
	}
	
	void rprint(Article article) {
		System.out.println("");
		System.out.println("번호 : " + article.getId());
		System.out.println("제목 : " + article.getTitle());
		System.out.println("내용 : " + article.getBody());
		System.out.println("작성자 : " + article.getWriter());
<<<<<<< HEAD
		System.out.println("조회수 : " + article.getViewsmanage());
		System.out.println("좋아요 : " + article.getLikemanage() + " / 싫어요 : " + article.getUnlikemanage());
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
		System.out.println("");

		ArrayList<Reply> reply = article.getReplies();
		
		for(int i = 0; i < reply.size(); i++) {
			System.out.println("----------------------------------------------");
			System.out.println("댓글 : " + reply.get(i).getBody());
			System.out.println("작성자 : " + reply.get(i).getWriter());
			System.out.println("작성일 : " + reply.get(i).getRegDate());
			System.out.println("");
		}
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		ArticleDao dao = new ArticleDao();
		String title;
		String body;
		String Id;
		String Pw;
		String name;
		print p = new print();
		Article loginedmember = null;
		
		
		while(true) {
			System.out.println("");
			p.menu();
			
			String s = sc.nextLine();
			
			if(s.equals("add")) {
				
				if(loginedmember == null) {
					System.out.println("로그인이 필요합니다.");
					System.out.println("로그인 : login / 회원가입 : signup");
				}
				
				else {
					System.out.println("");
					System.out.println("제목을 입력하십시오.");
					title = sc.nextLine();
					System.out.println("내용을 입력하십시오.");
					body = sc.nextLine();

					Article article = new Article();
					article.setTitle(title);
					article.setBody(body);
					article.setWriter(loginedmember.getMember());
					article.setRegDate(CurrentTime());
					
					dao.addData(article);
				}
			}
			
			else if(s.equals("signup")) {
				System.out.println("");
				System.out.println("아이디를 입력해주십시오.");
				Id = sc.nextLine();
<<<<<<< HEAD
				Article a = mm.getMemberById(Id);
				if(a == null) {
					System.out.println("비밀번호를 입력해주십시오.");
					Pw = sc.nextLine();
					System.out.println("이름을 입력해주십시오.");
					name = sc.nextLine();
					System.out.println("가입이 완료되었습니다.");
					
					Article member = new Article();
					member.setMember(Id);
					member.setPassword(Pw);
					member.setName(name);

					mm.signup(member);
				}
				else {
					System.out.println("있는 아이디입니다.");
				}
=======
				System.out.println("비밀번호를 입력해주십시오.");
				Pw = sc.nextLine();
				System.out.println("이름을 입력해주십시오.");
				name = sc.nextLine();
				System.out.println("가입이 완료되었습니다.");
				
				Article member = new Article();
				member.setMember(Id);
				member.setPassword(Pw);
				member.setName(name);
				
				mm.signup(member);
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
			}
			
			else if(s.equals("login")) {

				System.out.print("아이디 : ");
				String id = sc.nextLine();
				System.out.print("비밀번호 : ");
				String pw = sc.nextLine();

				Article member = mm.getMemberById(id);
				
				if(member == null) {
					System.out.println("틀린 아이디입니다.");
				}
				else {
					if(pw.equals(member.getPassword())) {
						System.out.println(member.getMember() + "님 환영합니다!");
						loginedmember = member;
					}
					else {
						System.out.println("틀린 비밀번호입니다.");
					}
				}
			}
			
<<<<<<< HEAD
			else if(s.equals("logout")) {
				loginedmember = null;
			}
			
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
			else if(s.equals("list")) {
				ArrayList<Article> articles = dao.listData();
				
				print(articles);
			}
			
			else if(s.equals("read")) {
				ArrayList<Article> articles = dao.listData(); 
				
				for(int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					
					System.out.println("");
					System.out.println("번호 : " + article.getId());
		    		System.out.println("제목 : " + article.getTitle());
		    		System.out.println("");
		    		
				}
			}
			
			else if(s.equals("detail")) {
				System.out.println("");
				System.out.println("보고싶은 게시물의 번호를 입력해주십시오.");
				int id = sc.nextInt();
				sc.nextLine();
<<<<<<< HEAD
				ArrayList<Like> likes = new ArrayList<Like>();
				Like like = new Like();
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
				
				
				Article article = dao.getArticleById(id);
				
				if(article == null) { 
					System.out.println("");
					System.out.println("게시물이 존재하지 않습니다.");
				}
				else {
					rprint(article);
		    		while(true) {
<<<<<<< HEAD
		    			System.out.println("좋아요 : like / 싫어요 : unlike, 댓글 달기 : reply, 뒤로 가기 : back");
=======
		    			System.out.println("좋아요 : like / 댓글 달기 : reply / 뒤로 가기 : back");
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
		    			String a = sc.nextLine();
		    			if(a.equals("reply")) {
		    				if(loginedmember == null) {
		    					System.out.println("로그인이 필요합니다.");
		    				}
		    				else {
		    					System.out.println("댓글을 입력해주십시오.");
		    					Reply reply = new Reply();
		    					String rbody = sc.nextLine();
		    					reply.setBody(rbody);
		    					reply.setWriter(loginedmember.getMember());
		    					reply.setRegDate(CurrentTime());
		    					article.addReply(reply);
		    					System.out.println("댓글이 등록되었습니다.");
		    					rprint(article);
		    				}
		    			}
		    			else if(a.equals("like")) {
<<<<<<< HEAD
		    				if(loginedmember == null) {
	    					System.out.println("로그인이 필요합니다.");
		    				}
		    				
				    		else {
				    			if(like == null) {
				    				article.getLike();
				    				rprint(article);
									like.setCheckUser(loginedmember.getMember());

				    				ld.addData(like);
			    				}
			    				else {
			    					System.out.println("좋아요 / 싫어요는 한 번만 누를 수 있습니다.");
			    				}
		    				}
		    			}
		    			else if(a.equals("unlike")) {
		    				if(like == null) {
		    					if(loginedmember == null) {
			    					System.out.println("로그인이 필요합니다.");
			    				}
				    			else {
				    				article.getUnlike();
				    				article.getLike();
				    				rprint(article);
									like.setCheckUser(loginedmember.getMember());

				    				ld.addData(like);
			    				}
		    				}
		    				else {
		    					System.out.println("좋아요 / 싫어요는 한 번만 누를 수 있습니다.");
		    				}
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
		    			}
		    			else if(a.equals("back")) {
		    				break;
		    			}
		    		}
				}
			}
			
<<<<<<< HEAD
			else if(s.equals("sort")) {
				System.out.println("정렬 대상을 입력해주십시오.(좋아요 : like / 조회수 : hit)");
				String sortTarget = sc.nextLine();
				System.out.println("정렬 방법을 입력해주십시오.(오름차순 : asc / 내림차순 : desc)");
				String sortFlag = sc.nextLine();
				
				ArrayList<Article> articles = dao.listData();
				
				Sort so = new Sort();
				so.sortTarget = sortTarget;
				so.sortFlag = sortFlag;
				
				Collections.sort(articles, so);
				
				print(articles);
			}
			
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
			else if(s.equals("update")) {
				System.out.println("");
				System.out.println("수정을 원하는 게시물의 번호를 입력해주십시오.");
				int id = sc.nextInt();
				sc.nextLine();
				
				Article article = dao.getArticleById(id);
				
				if(article == null) { 
					System.out.println("");
					System.out.println("게시물이 존재하지 않습니다.");
				}
				else {
					System.out.println("");
					System.out.println("새로운 제목을 입력해주십시오.");
					title = sc.nextLine();
					article.setTitle(title);
					System.out.println("새로운 내용을 입력해주십시오.");
					body = sc.nextLine();
					article.setBody(body);
					
					dao.updateData(id, article);

					ArrayList<Article> articles = dao.listData();
					
					print(articles);
				}
			}
			else if(s.equals("delete")) {
				System.out.println("");
				System.out.println("삭제를 원하는 게시물의 번호를 입력해주십시오.");
				int id = sc.nextInt();
				sc.nextLine();
				
				Article article = dao.getArticleById(id);
				
				if(article == null) { 
					System.out.println("");
					System.out.println("게시물이 존재하지 않습니다.");
				}
				else {
					dao.deleteData(article);

					ArrayList<Article> articles = dao.listData();
					
					print(articles);
				}
			}	
			else if(s.equals("search")) {
				System.out.println("검색을 원하는 문자를 입력해주십시오. ");
				String word = sc.nextLine();
				
				ArrayList<Article> articles = dao.listData();
				
				for(int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					if(article.getTitle().contains(word)) {
						System.out.println("번호 : " + article.getId());
						System.out.println("제목 : " + article.getTitle());
					}
				}
			}
			else if(s.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}
	String CurrentTime() {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String time1 = format1.format(time);
		
		return time1;
	}
}

class login {
	

	ArrayList<Article> members = new ArrayList<>();
	
	void Login(String id, String pw) {

		if(LoginManage(id, pw) == -1) {
			for(int i = 0; i < members.size(); i++) {
				Article member = members.get(i);
				if(member.getMember().equals(id)) {
					if(member.getPassword().equals(pw)) {
						System.out.println(member.getName() + "님! 환영합니다.");
					}
				}
			}
		}
		
		else if(LoginManage(id, pw) == 0) {
			System.out.println("틀린 비밀번호입니다.");
		}
		
		else if(LoginManage(id, pw) == 1) {
			System.out.println("틀린 아이디입니다.");
		}
	}
	
	int LoginManage(String id, String pw) {

		for(int i = 0; i < members.size(); i++) {
			Article member = members.get(i);
			if(member.getMember().equals(id)) {
				if(member.getPassword().equals(pw)) {
					return -1;
				}
				else {
					return 0;
				}
			}
			else {
				return 1;
			}
		}
		
		return 10;
	}
}

class print {
	void menu() {
		System.out.println("원하는 기능에 맞게 입력해주십시오.");
<<<<<<< HEAD
		System.out.println("로그인 : login / 로그아웃 : logout");
		System.out.println("회원가입 : signup");
=======
		System.out.println("로그인 : login / 회원가입 : signup");
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
		System.out.println("게시물 추가 : add");
		System.out.println("게시물 조회 : list");
		System.out.println("게시물 목록 조회 : read");
		System.out.println("게시물 상세보기 : detail");
		System.out.println("게시물 수정 : update");
		System.out.println("게시물 삭제 : delete");
		System.out.println("게시물 검색 : search");
<<<<<<< HEAD
		System.out.println("게시물 정렬 : sort");
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
		System.out.println("프로그램 종료 : exit");
	}
}