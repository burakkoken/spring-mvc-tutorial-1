package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Burak Köken on 18.1.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
        return "Home"; // Home.jsp
    }
}
