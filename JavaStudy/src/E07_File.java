import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E07_File {
	/*
		# java.io.File
		
		- 파일에 대한 정보를 담을 수 있는 클래스
		- 있는 파일의 정보를 담을 수도 있고 아직 존재하지 않는 파일의 정보를 만들어 놓고 새 파일을 생성할 수도 있다.
	 */
	public static void main(String[] args) {
		
		File f1 = new File("myfiles/test.txt");
		File f2 = new File("myfiles/notexist.txt");
		File f3 = new File("myfiles/image.jpg");
		File f4 = new File("myfiles");
		
		// exists() : 해당파일 존재하는지 알 수 있다.
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		System.out.println("f4 exists? " + f4.exists());
		
		// canRead(), canWrite(), canExecute() : 해당 파일의 권한을 확인할 수 있다.
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		
		// getAbsolutePath() : 해당 파일의 절대 경로를 알아낼 수 있다.
		System.out.println(f1.getAbsolutePath());
		
		// isFile(), isDirectory() : 해당 인스턴스가 파일인지 폴더인지 알아낼 수 있다.
		System.out.println(f1.isFile());
		System.out.println(f2.isFile());
		System.out.println(f3.isFile());
		System.out.println(f4.isFile());
		System.out.println();
		System.out.println(f1.isDirectory());
		System.out.println(f4.isDirectory());
		
		/*
			절대 경로 : 최초의 위치부터 모든 것을 다 적어놓은 경로
			상대 경로 : 현재 위치로부터 원하는 파일을 찾아가는 경로 ( 나의 현재 위치에 따라 결과가 달라질 수 있다.)
			
			./ : 현재 위치 (생략 가능)
			../ : 현재 위치의 상위 폴더
			
			C:/java/wrokspace/src - 절대경로
			
			myfiles/emails.txt - 상대경로
		 */
		File ff1 = new File("C:/aiautomation_ssg/java-workspace/JavaStudy/myfiles/test.txt");
		File ff2 = new File("./myfiles/emails.txt");
		
		// isAbsolute() : 절대경로인지 여부를 확인
		System.out.println(ff1.isAbsolute());
		System.out.println(ff2.isAbsolute());
		
		File ff3 = new File("./myimages");
		File ff4 = new File("./mymusic/rock/");
		
		// mkdir() : 해당 경로에 디렉토리를 생성 (부모 폴더가 없으면 생성하지 않는다.)
		if(!ff3.exists()) {
			ff3.mkdir();
		}
		
		// mkdirs() : 해당 파일을 만들기 위한 부모 폴더까지 모두 만들어버린다.
		if(!ff4.exists()) {
			ff4.mkdirs();
		}
		
		File fff1 = new File("myfiles");
		File fff2 = new File("myfiles/emails.txt");
		
		// 해당 경로(폴더) 내부에 존재하는 모든 파일들을 볼 수 있다.
		String[] fileNames = fff1.list();
		
		for (String fileName : fileNames) {
			// 하나씩 꺼낸 자식 파일들의 이름으로 또 파일 객체를 생성
			File childFile = new File(fff1, fileName);
			
			System.out.println(childFile.getAbsolutePath());
		}
		
		System.out.println("파일의 리스트를 보는 경우 : " + fff2.list());
		
		// listFiles() : 폴더 안의 모든 내용을 File[]로 꺼내준다.
		File[] files = fff1.listFiles();
		
		for (File file : files) {
			System.out.println(file);
		}
		
		// FileReader, FileWriter, FileInputStream, FileOutputStream 등
		// 파일을 다루는 스트림 클래스들은 파일 객체를 사용할 수 있다.
		try {
			FileReader in = new FileReader(new File("myfiles/email_list.txt"));
			
			int ch;
			while((ch = in.read()) != - 1) {
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
