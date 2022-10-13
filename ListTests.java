import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests{ 

    @Test
    public void testFilter(){
        StringChecker sc = new StringChecker(){
            public boolean checkString(String s){
                return s.length() > 5;
            }
        };
        

        List<String> input = new ArrayList<>();
        input.add(0, "America");
        input.add(1, "Japan");
        input.add(2, "California");
        List<String> output = new ArrayList<>();
        output = ListExamples.filter(input, sc);
        List<String> answer = new ArrayList<>();
        answer.add(0, "America");
        answer.add(1, "California"); 
        assertEquals(answer, output);



    }

}