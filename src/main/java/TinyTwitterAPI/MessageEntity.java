package TinyTwitterAPI;

import com.googlecode.objectify.annotation.*;
import com.googlecode.objectify.Key;

@Entity
public class MessageEntity {
	@Id Long IdMessage;
	String message;
	//Key<UserEntity> driver; 


}
