package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;


public class Application {
	
	public int countWords(String words){
			
			String[] seperateWords = StringUtils.split(words, " ");
			return (seperateWords == null) ?0 : seperateWords.length;
		}
	
	public void greet(String[] arg){
		
			
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		greetings.add("Vanakkam");
		greetings.add("Haai");

		for (String ar : arg){

			greetings.add(ar);

		}

		
		for (String greeting : greetings){
			System.out.println("Greeting: "+greeting);
		}

	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet(args);//Need to provide commandline arguements for greeting..!
		int count = app.countWords("I have  four or five words");
		System.out.println("Word Count : "+count);
    }
}
