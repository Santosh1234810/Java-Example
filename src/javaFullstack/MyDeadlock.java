package javaFullstack;

public class MyDeadlock {
	String s1 = "Java";
	String s2 = "Unix";
	
	Thread t1 = new Thread()
			{
		public void run()
		{
			System.out.println("Inner thread class");
			while(true)
			{
				synchronized(s1) {
					
				}
				synchronized(s2) {
					System.out.println(s1 +" "+s2);
				}
			}
		}
			};
			
			Thread t2 = new Thread("MyThread2")
					{
				public void run()
				{
					while(true)
					{
						synchronized(s2)
						{
							
						}
						
						synchronized(s1)
						{
							System.out.println(s2 +" "+ s1);
						}
					}
					
				}
			};
		
	public static void main(String[] args) {
		MyDeadlock md = new MyDeadlock();
		md.t1.start();
		md.t2.start();
	}
}
