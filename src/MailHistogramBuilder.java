import java.util.List;

/**
 * Created by Gabriel on 27/10/2015.
 */
public class MailHistogramBuilder {

    public static Histogram<String> build(List<String> mailList){
        Histogram<String> histogram = new Histogram<>();
        for(String currentMail : mailList){
            histogram.increment(new Mail(currentMail).getDomain());
        }
        return histogram;
    }
}
