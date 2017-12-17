package TinyTwitterAPI;

import com.googlecode.objectify.annotation.*;
import java.sql.Timestamp;

@Entity
public class MessageEntity {
	@Id Long idMessage;
	String message;
	Long userId;
	@Index String timestamp;
	
	public MessageEntity() {}
	
	public MessageEntity(String message, Long userId) {
		this.message=message;
		this.userId=userId;
		
		timestamp = new Timestamp(System.currentTimeMillis()).toString();
		
		this.idMessage = null;
	}
	
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
	
	
	public void setTimestamp(String t) {
		timestamp = t;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
}
