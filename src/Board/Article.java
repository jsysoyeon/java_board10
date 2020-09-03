package Board;

import java.util.ArrayList;

public class Article {
	
	private int id;
	private String title;
	private String body;
	private String member;
	private String password;
	private String name;
	private String writer;
	private String regDate;
	private ArrayList<Reply> replies = new ArrayList<>();
	private ArrayList<Like> likes = new ArrayList<>();
	private int views;
	private int viewsmanage;

	public ArrayList<Like> getLikes() {
		return likes;
	}

	public void setLikes(ArrayList<Like> likes) {
		this.likes = likes;
	}
	
	public int getViewsmanage() {
		viewsmanage = views;
		return viewsmanage;
	}

	public void setViewsmanage(int viewsmanage) {
		this.viewsmanage = viewsmanage;
	}


	public int getViews() {
		views++;
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}


	public void addReply(Reply reply) {
		replies.add(reply);
	}
	
	public void addLike(Like like) {
		likes.add(like);
	}
	
	public ArrayList<Reply> getReplies() {
		return replies;
	}

	public void setReplies(ArrayList<Reply> replies) {
		this.replies = replies;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int time;
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	void setId(int id) {
		this.id = id;
	}
	
	int getId() {
		return this.id;
	}
 
	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
 
	public String getBody() {
		return body;
	}
 
	public void setBody(String body) {
		this.body = body;
	}
	
	public Like checkLikeByUserId(String checkUser) {
		
		for(int i = 0; i < likes.size(); i++) {
			if(likes.get(i).getCheckUser().equals(checkUser)) {
				return likes.get(i);
			}
		}
		return null;
	}
	
	public int getCountOfLikes() {
		int cnt = 0;
		
		for(int i = 0; i < likes.size(); i++) {
			if(likes.get(i).getLikeFlag() == 1) {
				cnt++;
			}
		}
		
		return cnt;
		
	}

	public int getCountOfHates() {
		return likes.size() - getCountOfLikes();
	}

	
}