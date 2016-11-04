import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class asdad {

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		students.add("李哥,男,1981-1-1");
		students.add("小陈,女,1982-5-6");
		students.add("小刘,女,1990-10-12");
		for (String info : students) {
			String[] aaa = info.split(",");
			System.out.println(Arrays.toString(aaa));
			for (int i = 0; i < aaa.length; i++) {
				System.out.println(aaa[i]);
			}
		}
	}
}
