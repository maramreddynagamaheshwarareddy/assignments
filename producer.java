package multithread;

public  class producer  implements Runnable
{
	String name ="mahesh";
	int m = 10;
	public  void srs() 
	{
		System.out.println("we are here for you");
	          
	}
	public  producer(String name) throws InterruptedException  
	{ 
		m=20;
		System.out.println("i am working ");
		Thread.sleep(100);
	}
	public producer( ) throws 	InterruptedException
	{
		if(m==10)
		{
	System.out.println("we are here to satisfy consumer");
	}
		else if(m==20)
		{
			System.out.println("your our best consumer");
		}
		else
		{
			System.out.println("sorry we cannot satify you");
		}
	}
	public void run() {
		
		// TODO Auto-generated method stub
		System.out.println("exit");
		srs();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
