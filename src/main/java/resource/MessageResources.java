package resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Message;
import services.MessageService;




public class MessageResources {

	@Path("messageagain")
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Message> getIt() {
		 
		 MessageService service=new MessageService();
	        return service.getMessage();
	    }
}
