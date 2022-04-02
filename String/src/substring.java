public class substring {
	public static void main(String [] args) {
		String str="sauravkumar";
		for(int i=0;i<str.length()-4;i++) {
		    String sub=str.substring(i, i+5);
		    int count =0;
		    for(int j=0;j<sub.length();j++) {
		    	char ch=sub.charAt(j);
		    	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
		    		count++;
		    	}
		    }
		    System.out.println(sub+" "+ count);
		}
		System.out.println(str);
	}

}