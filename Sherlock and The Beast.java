import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result 
{
    /*
     * Complete the 'decentNumber' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void decentNumber(int n) 
    {
    // Write your code here
        int a=n/3;
        int b=0;
        while(a>=0)
        {
            int r=n-3*a;
            if(r%5==0)
            {
                b=r/5;
                break;
            }
            a--;
        }
        if(a<0||b<0)
        {
            System.out.println("-1");
        }
        else
        {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<3*a;i++)
            {
                sb.append("5");
            }
            for(int i=0;i<5*b;i++)
            {
                sb.append("3");
            }
            System.out.println(sb.toString());
        }
    }
}
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                Result.decentNumber(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
