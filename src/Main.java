import java.io.File;

/**
 * Created by Gabriel on 27/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        File files = new File("./root");
        String[] names = files.list();
        for(String name : names){
            System.out.println(name);
        }
    }
}
