package pt.goncalo.quarkus.multimodule.issue;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
@OpenAPIDefinition(info = @Info(
        title = "Multi Module issue",
        version = "1.2.0",
        contact = @Contact(
                email = "goncalosamuel@gmail.com",
                name = "GoncaloPT"
        )),
        servers = {
                @Server(url = "/",description = "multi-module-issue")
        })
public class MultiModuleIssueApp extends Application {

}
