package TinyTwitterAPI;

import com.googlecode.objectify.annotation.*;
import com.googlecode.objectify.Key;

@Entity
public class MessageEntity {
	@Id Long idMessage;
	String message;
	Key<UserEntity> user;
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
	
	
	public Key<UserEntity> getUser(){
		return user;
	}
	
	public void setUser(Key<UserEntity> k) {
		user=k;
	}
	
	
	public void setTimestamp(Long t) {
		timestamp = t;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
}
