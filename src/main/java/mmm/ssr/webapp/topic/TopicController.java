package mmm.ssr.webapp.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring","spring framework", "this is my description"),
				new Topic("tom","tom linton", "he is awesome"),
				new Topic("ssr","self service reporting", "sweeeeeeeeeeeet")
				);
	}
	
}
