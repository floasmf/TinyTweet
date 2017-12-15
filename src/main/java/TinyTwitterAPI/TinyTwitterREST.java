package TinyTwitterAPI;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import com.googlecode.objectify.ObjectifyService;

import javax.inject.Named;

@Api(name = "tinyTwitterEndpoint", 
	 namespace = @ApiNamespace(ownerDomain = "TinyTwitter.com", 
	 						   ownerName = "TinyTwitter.com",
	 						   packagePath = "services"))
public class TinyTwitterREST {

	@ApiMethod(name = "getMessageById")
	public MessageEntity getMessageById(@Named("id") Long id) {		
		MessageEntity message = ObjectifyService.ofy().load().type(MessageEntity.class).filter("idMessage", id).first().now();
		
		return message;
	}
	
	
	@ApiMethod(name = "insertNewMessage")
	public MessageEntity insertNewMessage(MessageEntity message) {
		ObjectifyService.ofy().save().entity(message);
		return message;
	}
	
	@ApiMethod(name = "insertNewUser")
	public UserEntity insertNewUser(UserEntity user) {
	ObjectifyService.ofy().save().entity(user);
		return user;
	}	
	
}
