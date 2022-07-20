package Project10;
import java.util.regex.*;
public class regularexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[91]*{2}\\s[789][0-9]{9}","91 8765432109")); 
        System.out.println(Pattern.matches("[a-z]+","Kalam"));


	}

}
