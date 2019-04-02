import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
         Cricle[] cricles = new Cricle[3];
         cricles[0] = new Cricle();
         cricles[1] = new Cricle();
         cricles[2] = new Cricle();
        for(Cricle cricle : cricles){
            System.out.println("Before : " + cricle);
        }
        CricleComparator cricleComparator = new CricleComparator();
        Arrays.sort(cricles,cricleComparator);
        for(Cricle cricle : cricles){
            System.out.println("After : " + cricle);
        }
    }
}

