
public class PrintString {

	public String TrimEdges(String s) {
		String s2="";
		

			int start_pointer=0;    //By default the pointer starts at 0 index
			
			if(s.charAt(0)=='a' || s.charAt(0) == 'A' ) {
				start_pointer=1;
			}
			if((s.charAt(0) == 'a' || s.charAt(0) == 'A')&&(s.charAt(1) == 'a' || s.charAt(1) == 'A')) {
				start_pointer=2;
			}
			for(int i=start_pointer;i<s.length();i++) {
				s2 = s2 + Character.toString(s.charAt(i));
			}
		
		
		return s2;
	}
}
