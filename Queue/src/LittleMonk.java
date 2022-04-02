import java.util.*;
public class LittleMonk {
	static Deque<student> d=new LinkedList<student>();
	static class student{
		int school;
		int rollNo;
		student(int x,int y){
			school=x;
			rollNo=y;
		}
	}
	static void arrange(student s) {
		Stack <student> q=new Stack<student>();
		student temp=s;
		if(d.isEmpty()) {
			d.add(temp);
			return;
		}
		else {
			while(!d.isEmpty() && d.peekLast().school !=  temp.school) {
				q.add(d.removeLast());
			}
			if(d.isEmpty()) {
				 while(!q.isEmpty()) {
						d.add(q.pop());
					}
				 d.add(temp);
				 return;
			}
			else if(!d.isEmpty()) {
			       d.add(temp);
			       while(!q.isEmpty()) {
						d.add(q.pop());
					}
			       return;
			}
		}
		
	}
	
	public static void main(String [] args ) {
		Scanner sc=new Scanner(System.in);
		int Q=sc.nextInt();
		for(int i=0;i<Q;i++) {
			char ch=sc.next().charAt(0);
			if(ch=='E') {
				int x=sc.nextInt();
				int y=sc.nextInt();
				student s=new student(x,y);
				arrange(s);
			}
			if(ch=='D') {
				System.out.println(d.peek().school+"  "+d.peek().rollNo);
				d.remove();
			}
			
			
		}
	}

}
