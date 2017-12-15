package TinyTwitterAPI;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

@Api(name = "TinyTwitterEndpoint", 
	 namespace = @ApiNamespace(ownerDomain = "TinyTwitter.com", 
	 						   ownerName = "TinyTwitter.com",
	 						   packagePath = "services"))
public class TinyTwitterREST {

}
