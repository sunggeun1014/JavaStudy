import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E09_DataStream {
	
	/*
		# DataOutputStream, DataInputStream
		
		- 자바의 데이터 타입(int, float, double ...)을 전송할 수 있는 스트림
		- 자바의 변수 형식으로 전송하기 때문에 데이터를 전달받는 쪽에서도 자바를 해석할 수 있어야 한다.
	 */
	
	public static void main(String[] args) {
		
		try (
			FileOutputStream fout = new FileOutputStream("myfiles/data.abc");
			DataOutputStream dout = new DataOutputStream(fout);
		) {
			dout.writeInt(1000000);
			dout.writeDouble(123.123);
			dout.writeFloat(123.1234F);
			dout.writeByte(123);
			dout.writeShort(20000);
			dout.writeUTF("문자열!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (
				FileInputStream fin = new FileInputStream("myfiles/data.abc");
				DataInputStream din = new DataInputStream(fin);
		) { 
			System.out.println("처음썼던 int값: " + din.readInt());
			System.out.println("두번째로 썼던 double값: " + din.readDouble());
			System.out.println("세번째로 썼던 float값: " + din.readFloat());
			System.out.println("네번째로 썼던 byte값: " + din.readByte());
			System.out.println("다섯번째로 썼던 short값: " + din.readShort());
			System.out.println("마지막 문자열: " + din.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
