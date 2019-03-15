package org.lovelace.twitter;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

@RestController
public class FirstVerify {
    static final String CONSUMER_KEY = "ddddddddddddddddd";
    static final String CONSUMER_SECRET = "fffffffffffffffffffff";
    static final String ACCESS_TOKEN = "eeeeeeeeeeeeeeeeee";
    static final String ACCESS_TOKEN_SECRET = "ttttttttttttttttt";


    public static Twitter getTwitterInstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(CONSUMER_KEY)
                .setOAuthConsumerSecret(CONSUMER_SECRET)
                .setOAuthAccessToken(ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);

        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();
    }

    //test
    @RequestMapping(value="/FirstVerify")
    public String FirstVerify() throws TwitterException {
        return getTwitterInstance().getScreenName();
    }


}
