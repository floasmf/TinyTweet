package TinyTwitterAPI;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.Collection;


import javax.inject.Named;

@Api(name = "tinyTwitterEndpoint", 
	 namespace = @ApiNamespace(ownerDomain = "TinyTwitter.com", 
	 						   ownerName = "TinyTwitter.com",
	 						   packagePath = "services"))
public class TinyTwitterREST {

	@ApiMethod(name = "getMessageById")
	public MessageEntity getMessageById(@Named("id") Long id) {		
		MessageEntity message = OfyService.ofy().load().type(MessageEntity.class).id(id).now();
		
		return message;
	}
	
	@ApiMethod(name = "getLastMessagesByUser")
	public Collection<MessageEntity> getLastMessagesByUser(@Named("userId") Long userId, @Named("limit") int limit) {		
		Collection<MessageEntity> messages = OfyService.ofy().load().type(MessageEntity.class).filter("userId",userId).limit(limit).list();
		
		return messages;
	}
	
	
	@ApiMethod(name = "insertNewMessage")
	public MessageEntity insertNewMessage(@Named("message") String message, @Named("userId") Long userId) {
		MessageEntity me = new MessageEntity(message, userId);
		OfyService.ofy().save().entity(me).now();
		return me;
	}
	
	@ApiMethod(name = "insertNewUser")
	public UserEntity insertNewUser(@Named("username") String username) {
		UserEntity e = new UserEntity(username);
		OfyService.ofy().save().entity(e).now();
		return e;
	}
	
	@ApiMethod(name = "addFollow")
	public UserEntity addFollow(@Named("userId") Long userId, @Named("followId") Long follow) {
		UserEntity e = OfyService.ofy().load().type(UserEntity.class).id(userId).now();
		
		e.addFollow(follow);
		
		OfyService.ofy().save().entity(e);
		return e;
	}
	
}
