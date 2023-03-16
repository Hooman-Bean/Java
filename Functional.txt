import java.util.*;
import java.util.stream.Collectors;
public class Functional {
    public static void main(String[] args) {
        
    
    double a[]={1,2,4,3,6,5,8,7,9};
    double sum = Arrays.stream(a).sum();
    double average = Arrays.stream(a).average().getAsDouble();
    double min = Arrays.stream(a).min().getAsDouble();
    double product = Arrays.stream(a).reduce(1,(m,M)->m*M);
    double count = Arrays.stream(a).filter(e->e>=3&&e<=7).count();
        System.out.println("Sum = "+ sum+"\n"+"Average = "+average+"\n"
                +"Minimum = "+min+"\n"+"Product = "+product+"\n"
                        +"Numbers between 3 and 7 = "+count);
        
    String[]ran={"aads","asd","sad","esd","fefw","wdf"};
    List<String>l=Arrays.asList(ran);
    int num = l.stream().mapToInt(String::length).max().getAsInt();
    String collection = l.stream().collect(Collectors.joining(","));
        System.out.println("Length of the longest String = "+num+"\n"
                +"Combination of strings in the list comma seperated = "
                +collection);
    }
    
}
