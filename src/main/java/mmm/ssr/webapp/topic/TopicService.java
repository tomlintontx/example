package mmm.ssr.webapp.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring","spring framework", "this is my description"),
			new Topic("tom","tom linton", "he is awesome"),
			new Topic("ssr","self service reporting", "sweeeeeeeeeeeet")
			);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
}
