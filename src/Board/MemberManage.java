<<<<<<< HEAD
=======
<<<<<<< HEAD
  
=======
>>>>>>> dcacdcd2df42df851078ad776a5c7097436a5371
>>>>>>> 2f751d3ff574c29ea6627ef30b0f95ba85a4eac1
package Board;
 
import java.util.ArrayList;

public class MemberManage {
	ArrayList<Article> members = new ArrayList<>();
	
	void signup(Article member) {
		members.add(member);
	}
	
	ArrayList<Article> memberData() {
		return members;
	}
	
	int getIndexById(String id) {
		for(int i = 0; i < members.size(); i++) {
			if(id.equals(members.get(i).getMember())) {
				return i;
			}
		}
		
		return -1;
	}
	
	Article getMemberById(String id) {
		int index = getIndexById(id);
		
		if(index == -1) {
			return null;
		}
		
		return members.get(index);
		
	}
}