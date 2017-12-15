package TinyTwitterAPI;
import com.googlecode.objectify.annotation.*;

@Entity
public class UserEntity {
	@Id Long IdUser;
	String name;
	
	public UserEntity(Long id, String n) {
		IdUser = id;
		name = n;
	}
	
	public Long getId() {
		return IdUser;
	}
	
	public void setId(Long id) {
		IdUser = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
}