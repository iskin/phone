import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		Map<String, List<String>> phoneBook = new HashMap<String, List<String>>();
		List<String> phones = new ArrayList<String>();

		phoneBook.put("Иванов И.И.", Arrays.asList("+8 800 2000 500", "+8 800 2000 600"));
		phoneBook.put("Петров П.П.", Arrays.asList("+8 800 2000 700"));
		phoneBook.put("Сидоров С.С.", Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"));

		Scanner in = new Scanner(System.in);
		String name;

		do {
			System.out.println("Enter name for search. Enter '0' to stop");
			name = in.nextLine();

			if (phoneBook.containsKey(name)) {
				for (Entry<String, List<String>> entry : phoneBook.entrySet()) {
					if (name.equals(entry.getKey())) {
						phones = entry.getValue();
						for (int i = 0; i < phones.size(); i++) {
							System.out.println(i + 1 + ". " + phones.get(i));
						}
					}
				}
			} else {
				if (!"0".equals(name)) {

					System.out.println("No such name in base");
				}
			}
		} while (!"0".equals(name));

	}

}
