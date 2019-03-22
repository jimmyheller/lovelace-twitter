package org.lovelace.twitter.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserTimeLineController {

    private static final String CONSUMER_KEY = "";
    private static final String CONSUMER_SECRET = "";
    private static final String ACCESS_TOKEN = "";
    private static final String ACCESS_TOKEN_SECRET = "";

    @GetMapping
    public @ResponseBody
    String getBasicInfo() throws TwitterException {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey(CONSUMER_KEY)
                .setOAuthConsumerSecret(CONSUMER_SECRET)
                .setOAuthAccessToken(ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);

        TwitterFactory twitterFactory = new TwitterFactory(configurationBuilder.build());
        Twitter twitter = twitterFactory.getInstance();
        List<Status> statuses = twitter.getUserTimeline();
        System.out.println("Showing home timeline.");
        StringBuilder builder = new StringBuilder();
        for (Status status : statuses) {
            builder.append(status.getUser().getName()).append(":").append(status.getText());
        }
        return String.valueOf(builder);
    }
}
