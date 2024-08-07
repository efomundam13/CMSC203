
public class StringBuilderExample {
	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Emmanuel Fomundam, ");
		sb.append("Computer Science, ");
		sb.append("CMSC203");
		System.out.println(sb);
		if(sb.isEmpty()) {
			System.out.println("Add something");
		}
		else {
			System.out.println("The capacity is: " + sb.capacity());
		}
		System.out.print("The character at position 14 is: " + sb.charAt(14));
		
	}
}
