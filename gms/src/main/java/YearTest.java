import java.text.SimpleDateFormat;
import java.util.Date;

public class YearTest {
	public static void main(String[] args) {
		String year = new SimpleDateFormat("yyyy").format(new Date());
		System.out.println(year);
		
	
	}
}
