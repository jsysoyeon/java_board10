package Board;
 
import java.util.ArrayList;
 
public class ArticleDao {
	ArrayList<Article> articles = new ArrayList<Article>();
	int lastId = 4;
	
	ArticleDao() {
		testData();
	}
	
	void testData() {
		Article article1 = new Article();
		article1.setId(1);
		article1.setTitle("abc");
		article1.setBody("abc");
		article1.setWriter("a");
		article1.setRegDate("2020-08-27");
		article1.setViews(150);

		Article article2 = new Article();
		article2.setId(2);
		article2.setTitle("123");
		article2.setBody("123");
		article2.setWriter("b");
		article2.setRegDate("2020-08-27");
		article2.setViews(37);

		Article article3 = new Article();
		article3.setId(3);
		article3.setTitle("ㄱㄴㄷ");
		article3.setBody("ㄱㄴㄷ");
		article3.setWriter("c");
		article3.setRegDate("2020-08-27");
		article3.setViews(350);
		articles.add(article1);
		articles.add(article2);
		articles.add(article3);
	}
	
	void addData(Article article) {
		 article.setId(lastId);
		 articles.add(article);
	}
	
	ArrayList<Article> listData() {
		return articles;
	}
	
	void updateData(int id, Article article) {
		int index = getIndexById(id);
		
		if(index != -1) articles.set(index, article);
	}
	
	void deleteData(Article article) {
		articles.remove(article);
	}
	
	Article getArticleById(int id) {
		int index = getIndexById(id);
		
		if(index == - 1) return null;
		
		return articles.get(index);
	}
	
	int getIndexById(int id) {
		for(int i = 0; i < articles.size(); i++) {
			if(id == articles.get(i).getId()) {
				return i;
			}
		}
		
		return -1;
	}
	
}