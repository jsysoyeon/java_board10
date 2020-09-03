package Board;

import java.util.ArrayList;

public class LikeDao {
	ArrayList<Like> likes = new ArrayList<>();
	
	void addData(Like like) {
		 likes.add(like);
	}
	
	ArrayList<Like> memberData() {
		return likes;
	}
	
	int getIndexById(String id) {
		for(int i = 0; i < likes.size(); i++) {
			if(id.equals(likes.get(i).getCheckUser())) {
				return i;
			}
		}
		
		return -1;
	}
	
	Like getMemberById(String id) {
		int index = getIndexById(id);
		
		if(index == -1) {
			return null;
		}
		
		return likes.get(index);
		
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 2f751d3ff574c29ea6627ef30b0f95ba85a4eac1
