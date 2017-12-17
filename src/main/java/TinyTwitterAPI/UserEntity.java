package TinyTwitterAPI;
import com.googlecode.objectify.annotation.*;
import java.util.Set;
import java.util.HashSet;

@Entity
public class UserEntity {	
	@Id Long idUser;
	String username;
	Set<Long> follows = new HashSet<Long>();
	
	public UserEntity() {}
	
	public UserEntity(String username) {
		this.username = username;
		idUser = null;		
	}
	
		
	public Long getId() {
		return idUser;
	}
	
	public void setId(Long id) {
		idUser = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String n) {
		username = n;
	}
	
	public void addFollow(Long follow) {
		follows.add(follow);
	}
	
	public void removeFollow(Long follow) {
		follows.remove(follow);
	}
}