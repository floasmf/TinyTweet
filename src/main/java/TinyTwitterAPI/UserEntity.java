package TinyTwitterAPI;
import com.googlecode.objectify.annotation.*;

@Entity
public class UserEntity {
	@Id Long idUser;
	String name;
	
		
	public Long getId() {
		return idUser;
	}
	
	public void setId(Long id) {
		idUser = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
}