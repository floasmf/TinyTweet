package TinyTwitterAPI;

import com.googlecode.objectify.annotation.*;

@Entity
public class MessageEntity {
	@Id Long IdMessage;
	String message;


}
