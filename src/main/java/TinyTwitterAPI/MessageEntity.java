package TinyTwitterAPI;

import com.googlecode.objectify.annotation.*;

@Entity
public class MessageEntity {
	@Id Long idMessage;
	String message;
	Long userId;
	Long timestamp;
	
	
	public Long getIdMessage() {
		return idMessage;
	}
	
	public void setIdMessage(Long id) {
		idMessage = id;
	}
	
	
	public String getMessage() {
		return message;		
	}
	
	public void setMessage(String m) {
		message=m;
	}
	
	
	public Long getUser(){
		return userId;
	}
	
	public void setUser(Long k) {
		userId=k;
	}
	
	
	public void setTimestamp(Long t) {
		timestamp = t;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
}
