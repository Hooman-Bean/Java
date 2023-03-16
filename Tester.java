//  from Java Tutorial on Regex

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tester {    //test "harness"

    public static void main(String[] args) {
        //System.out.println("My dog your dogerel his dog ".replaceAll("dog","cat"));
        //System.out.println("My dog your dogerel his dog".replaceAll("\\bdog\\b","cat"));
        //String x = "aaabaa"; x = x.replaceAll("a*?","aa"); System.out.println("x=="+x+"==");

              
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter regex: ");
            String re = sc.nextLine().trim();
            if (re.length() == 0) {
                break;
            }
            Pattern p = Pattern.compile(re);

            while (true) {
                System.out.println("Enter a line of text to search (xxx)");
                String text = sc.nextLine();
                if (text.equals("xxx")) {
                    break;
                }
                System.out.println("testlength =" + text.length());
                Matcher m = p.matcher(text);

                System.out.println("Match = " + m.matches());
                m.reset();

                boolean $found = false;
                while (m.find()) {

                    System.out.printf("found ==%s== at %d end at %d\n", m.group(), m.start(), m.end());
                    $found = true;
                }
                if (!$found) {
                    System.out.println("No match found");
                }
            }
        }
    }
}
