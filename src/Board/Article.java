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
	private int views;
	private int like;
	private int unlike;
	private int viewsmanage;
	private int likemanage;
	private int unlikemanage;
	
	public int getUnlike() {
		unlike++;
		return unlike;
	}

	public void setUnlike(int unlike) {
		this.unlike = unlike;
	}

	public int getUnlikemanage() {
		unlikemanage = unlike;
		return unlikemanage;
	}

	public void setUnlikemanage(int unlikemanage) {
		this.unlikemanage = unlikemanage;
	}

	public int getViewsmanage() {
		viewsmanage = views;
		return viewsmanage;
	}

	public void setViewsmanage(int viewsmanage) {
		this.viewsmanage = viewsmanage;
	}

	public int getLikemanage() {
		likemanage = like;
		return likemanage;
	}

	public void setLikemanage(int likemanage) {
		this.likemanage = likemanage;
	}

	public int getViews() {
		views++;
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLike() {
		like++;
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public void addReply(Reply reply) {
		replies.add(reply);
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
	
}