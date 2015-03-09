package prueba.de.cod.libreria.twitter;

import java.util.List;
import javax.swing.JOptionPane;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class PruebaDeCODLibreriaTwitter {

    public static void main(String[] args) throws TwitterException {

        Twiter tweet = new Twiter();
        //tweet.gettingTimeLine();
        //tweet.consultarTweets(JOptionPane.showInputDialog(""));
        tweet.hacerUnTweet(JOptionPane.showInputDialog(""));
        

    }

}
