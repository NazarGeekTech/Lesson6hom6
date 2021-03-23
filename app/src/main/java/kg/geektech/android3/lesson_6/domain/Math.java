package kg.geektech.android3.lesson_6.domain;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }
    public int  minus(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;

    }
    public int division(int a, int b) {
        if (b !=0) {
            return a / b;
        }else {
            System.out.println("division by 0");
            return 0;
        }
    }

    public int pow(int a, int b){
        return (int) java.lang.Math.pow(a,b);
    }

    public int sqRoot(int a){
        return (int) java.lang.Math.sqrt(a);
    }

    public String reversWords(String str) {
        String result= str;

        if (str !=null) {
            Pattern pattern = Pattern.compile("\\s");
            Matcher matcher = pattern.matcher(str);
            boolean found = matcher.find();

            if (found) {
                StringTokenizer st = new StringTokenizer(str);
                int wordsCount = st.countTokens();

                if (wordsCount == 2) {
                    String[] words = str.split(" ");
                    StringBuilder builder = new StringBuilder();
                    builder.append(words[1]).append(" ").append(words[0]);
                    result = builder.toString();
                }
                else if (wordsCount ==3){
                    String[] words = str.split(" ");
                    StringBuilder builder = new StringBuilder();
                    builder.append(words[2]).append(" ").append(words[1])
                            .append(" ").append(words[0]);
                    result = builder.toString();
                }
            }
        } else {
            result = "";
        }
        return result;
    }

}
