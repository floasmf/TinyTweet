package TinyTwitterAPI;
import com.googlecode.objectify.annotation.*;

@Entity
public class UserEntity {
	@Id Long IdUser;
	String name;
}