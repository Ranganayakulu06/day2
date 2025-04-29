public class StringConcatenator{
	public static void concatenateStrings(String str1, String str2){
		String result=str1 + str2;
		System.out.println("Concatenated String: " + result);
}
	public static void main(String [] args){
		concatenateStrings("Hello", "World");
}
}