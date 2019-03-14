package org.lovelace.twitter;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

@RestController
public class FirstVerify {
    static final String CONSUMER_KEY = "IhB8qInT7kk1lsQj9An0Ag";
    static final String CONSUMER_SECRET = "qPRk6OxklyNQkfQqeW7BPLU0vcIGeG0K9yIPZbjOsRY";
    static final String ACCESS_TOKEN = "34608520-iL1zEjx86Cr6G86BoG2ZJpaFan6qFd3jBiohWvj7U";
    static final String ACCESS_TOKEN_SECRET = "YWyy5JT9RwrjS4eX5SZdtPWOPRp5vYnj0prFmFZRG59tX";


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
    @RequestMapping(value="/FirstVerify")
    public String FirstVerify() throws TwitterException {
        return getTwitterInstance().getScreenName();
    }


}
