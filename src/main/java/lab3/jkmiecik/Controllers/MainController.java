package lab3.jkmiecik.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// controller handles routing for app
// defaults to index page
@Controller
public class MainController {

    // GetMapping searches for the requested mapping
    // and performs appropriate function
    @GetMapping("/page1")
    public String getPage1(){
        return "page1.html";
    }

    @GetMapping("/page2")
    public String getPage2(){
        return "page2.html";
    }

    // Start of part 4 - My own additions

    @GetMapping("/static")
    public String getStatic1(){
        return "static.html";
    }

    @GetMapping("/dynamic")
    public String getDynamic1(){
        return "dynamic.html";
    }

    @GetMapping("formTest")
    @ResponseBody
    public String formTest(){
        String html =
            "<html>" +
            "<body>" +
                "<form method = 'get' action = '/form'>" +
                    "<input type = 'text' name = 's' />" +
                    "<input type = 'submit' value = 'Greet Me!' />" +
                "</form>" +
            "</body>" +
            "</html>";
        return html;
    }

    @GetMapping("/form")
    @ResponseBody
    public String hello(@RequestParam String s) {
        return "Hello, " + s + "!";
    }
}
