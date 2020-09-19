package disk;

public class splitTheLast {

    public static String lastName(String str){
        String[] ss=str.split("\\\\");
       return ss[ss.length-1];
    }


}
