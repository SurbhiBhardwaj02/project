import com.NegativeValuesException;
import com.ValueOutOfRangeException;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        for(int i=0;i<2;i++) {
            String name = "";
            int s1marks = 0;
            int s2marks = 0;
            int s3marks = 0;

            try {

                name = s.next();

                if (s.hasNextInt())
                    s1marks = s.nextInt();
                else
                    throw new NumberFormatException();

                if (s.hasNextInt())
                    s2marks = s.nextInt();
                else
                    throw new NumberFormatException();

                if (s.hasNextInt())
                    s3marks = s.nextInt();
                else
                    throw new NumberFormatException();

                if (s1marks < 0) throw new NegativeValuesException();
                if (s1marks > 100) throw new ValueOutOfRangeException();

                if (s2marks < 0) throw new NegativeValuesException();
                if (s2marks > 100) throw new ValueOutOfRangeException();

                if (s3marks < 0) throw new NegativeValuesException();
                if (s3marks > 100) throw new ValueOutOfRangeException();

            } catch (NumberFormatException e) {
                System.out.println(e);
            } catch (ValueOutOfRangeException e) {
                System.out.println(e);
            } catch (NegativeValuesException e) {
                System.out.println(e);
            }
            System.out.println("Name=" + name);
            System.out.println("Marks in 1st subject: " + s1marks);
            System.out.println("Marks in 2nd subject: " + s2marks);
            System.out.println("Marks in 3rd subject: " + s3marks);

        }
        s.close();

    }
}
