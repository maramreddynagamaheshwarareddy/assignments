package multithread;

public class consumer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  producer pr=new producer();
   producer hh=new producer("mahesh");
   //Thread t1= new Thread(pr);
   Thread t1= new Thread(hh);
   
  // producer pr=new producer();
   Thread t2= new Thread(pr);
   t2.start();
	}

}
