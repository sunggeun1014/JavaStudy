package quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05_EmailListFile {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[\\w]+@[\\w]+[.][\\w]+([.][\\w]+)?");
		Matcher m = p.matcher(D11_ReporterList.reporters);
		
		FileWriter writer = null;
		try {
			writer = new FileWriter("myfiles/email_list.txt");
			while(m.find()) {
				writer.write(m.group() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
