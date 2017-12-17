package TinyTwitterAPI;

import java.util.logging.Logger;
import java.util.logging.Level;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

public class OfyService {
    private static final Logger logger = Logger.getLogger(OfyService.class.getName());

    static {
        try {
            ObjectifyService.register(UserEntity.class);
            ObjectifyService.register(MessageEntity.class);
            
        } catch (Exception e) {
            logger.log(Level.SEVERE,e.toString());
        }
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}