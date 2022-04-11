package cosc310Bot;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterAPI {

	public static void main(String[] args) throws TwitterException {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("p6b8ecgDImnH7LKGZTez4g5ae")
		.setOAuthConsumerSecret("XKpkHBphSKfl20OUcZXsukEIxcRMyQgDkl5rJVziTxMBJ6K9F8")
		.setOAuthAccessToken("2981854827-B92OLLTvIrsM4La4KACm2KJmseL2nBQ5J6o3GWw")
		.setOAuthAccessTokenSecret("UwkNVvzk4rvYRgQatoz7yIV9r4UrHOjoKpJNCVN6FJnie");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();

		List<Status> statusList = null;

		try {
			statusList = twitter.getUserTimeline("@jack");
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Status status : statusList) {
			System.out.println(status.getText());
			break;
		} 	
	}
}
