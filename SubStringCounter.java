public class SubstringCounter {

	public static int countSubstr(String subStr, String str) {
		
		return (str.length() - str.replace(subStr, "").length()) / subStr.length();
	}
	
	public static void main(String[] args){

		System.out.println(countSubstr("abc", "xabcxabcxabcx"));
    }
}