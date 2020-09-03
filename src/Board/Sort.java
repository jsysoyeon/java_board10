package Board;

import java.util.Comparator;
import java.util.Scanner;

public class Sort implements Comparator <Article> {

	String sortTarget;
	String sortFlag;
	
	@Override
	public int compare(Article o1, Article o2) {
		
		if(sortTarget.equals("hit")) {
			if(sortFlag.equals("asc")) {
				if(o1.getViewsmanage() > o2.getViewsmanage()) {
					return 1;
				}
				return -1;
			}
			else if(sortFlag.equals("desc")) {
				if(o1.getViewsmanage() < o2.getViewsmanage()) {
					return 1;
				}
				return -1;
			}
		}
		else if(sortTarget.equals("like")) {
			if(sortFlag.equals("asc")) {
				if(o1.getCountOfLikes() > o2.getCountOfLikes()) {
					return 1;
				}
				return -1;
			}
			else if(sortFlag.equals("desc")) {
				if(o1.getCountOfLikes() < o2.getCountOfLikes()) {
					return 1;
				}
				return -1;
			}
		}
		
		return 0;
	}

}
