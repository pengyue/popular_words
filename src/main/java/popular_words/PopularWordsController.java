package popular_words;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PopularWordsController {

    @RequestMapping("/")
    public String index() {
        return "Greeting from the Popular Words";
    }
}
