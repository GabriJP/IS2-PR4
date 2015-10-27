import java.io.File;

/**
 * Created by Gabriel on 27/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("./root");
        print(file.listFiles(), "");
    }

    private static void print(File[] files, String indent){
        if(files != null){
            for(File file : files){
                if(file.isDirectory()){
                    if(file.isHidden()){
                        System.out.println(indent + "<<" + file.getName() + "/" + ">>");
                    } else {
                        System.out.println(indent + file.getName() + "/");
                    }
                    print(file.listFiles(), indent + "\t");
                } else {
                    if(file.isHidden()){
                        System.out.println(indent + "<<" + file.getName() + ">>");
                    } else {
                        System.out.println(indent + file.getName());
                    }
                }
            }
        }
    }
}
