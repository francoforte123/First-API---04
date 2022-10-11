package First.API4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/header")
public class HeaderController {

    public String getHeader(HttpServletRequest request){
        return "server name: " + request.getServerName() + ", " + "server port: " + request.getServerPort();
    }
}
