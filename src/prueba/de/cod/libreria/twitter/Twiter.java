package prueba.de.cod.libreria.twitter;

import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Twiter {

    Twitter mitwitter;

    public Twiter() {
        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("VoSmbUz4KtX6LWMADG2wjcai4")
                .setOAuthConsumerSecret("l6UmkUXGVp7kARYmNGB0of5PsVuelFaokEm9rI4v5Fsjb9KZ7U")
                .setOAuthAccessToken("3055290010-QWLhHK12ERY0t18MVAXQk4EfINP44CO9LtFP2Xq")
                .setOAuthAccessTokenSecret("JsDAHOzJOk0YPlXQn56WOM6zpzei2nKvd4m1VerbVT2Gf");
        TwitterFactory tf = new TwitterFactory(cb.build());
        mitwitter = tf.getInstance();
    }

    public void gettingTimeLine() throws TwitterException {
        List<Status> statuses = mitwitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":" + status.getText());
        }
    }

    public void consultarTweets(String consulta) throws TwitterException {
        Query query = new Query(consulta);
        QueryResult result = mitwitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }

    public void hacerUnTweet(String busqueda) throws TwitterException {

        Status status = mitwitter.updateStatus(busqueda);
        System.out.println("Successfully updated the status to [" + status.getText() + "].");
    }
}
