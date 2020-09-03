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
<<<<<<< HEAD
		article1.setViews(150);
		article1.setLike(30);
		article1.setUnlike(2);
=======
<<<<<<< HEAD
		article1.setViews(150);
		article1.setLike(30);
		article1.setUnlike(2);
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
>>>>>>> 2f751d3ff574c29ea6627ef30b0f95ba85a4eac1

		Article article2 = new Article();
		article2.setId(2);
		article2.setTitle("123");
		article2.setBody("123");
		article2.setWriter("b");
		article2.setRegDate("2020-08-27");
<<<<<<< HEAD
		article2.setViews(37);
		article2.setLike(15);
		article2.setUnlike(5);
=======
<<<<<<< HEAD
		article2.setViews(37);
		article2.setLike(15);
		article2.setUnlike(5);
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
>>>>>>> 2f751d3ff574c29ea6627ef30b0f95ba85a4eac1

		Article article3 = new Article();
		article3.setId(3);
		article3.setTitle("ㄱㄴㄷ");
		article3.setBody("ㄱㄴㄷ");
		article3.setWriter("c");
		article3.setRegDate("2020-08-27");
<<<<<<< HEAD
		article3.setViews(350);
		article3.setLike(3);
		article3.setUnlike(0);
=======
<<<<<<< HEAD
		article3.setViews(350);
		article3.setLike(3);
		article3.setUnlike(0);
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
>>>>>>> 2f751d3ff574c29ea6627ef30b0f95ba85a4eac1
		
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