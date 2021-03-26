
public class Position {
	int id;
	String name;
	
	@Override
	public String toString() {
		String result ="";
		result += "ID:" + id + "\n";
		result += "Name:" + name ;
		return result;
	}
}
