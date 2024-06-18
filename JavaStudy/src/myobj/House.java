package myobj;

public class House {
	String householder;
	String addr;
	
	public House(String householder, String addr) {
		this.householder = householder;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "세대주 : " + householder + "\n" + "주소 : " + addr;
	}
	
	@Override
	public boolean equals(Object obj) {
		return addr.equals(((House)obj).addr);
	}
	
	@Override
	public int hashCode() {
		return addr.hashCode();
	}
}
