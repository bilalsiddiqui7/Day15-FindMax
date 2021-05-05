public class FindMaximum {
	public static Integer findMaxInteger(Integer a,Integer b,Integer c)
	{
		int maximum=a;
		if(b.compareTo(maximum)>0)
			maximum=b;
		if(c.compareTo(maximum)>0)
			maximum=c;
		return maximum;
	}
	
	public static Double findMaxDouble(Double a,Double b,Double c)
	{
		Double maximum=a;
		if(b.compareTo(maximum)>0)
			maximum=b;
		if(c.compareTo(maximum)>0)
			maximum=c;
		return maximum;
	}
	
	public static String findMaxString(String a,String b,String c)
	{
		String maximum=a;
		if(b.compareTo(maximum)>0)
			maximum=b;
		if(c.compareTo(maximum)>0)
			maximum=c;
		return maximum;
	}
	
	public static <T extends Comparable<T>> T findMaxGeneric(T a,T b,T c)
	{
		T maximum=a;
		if(b.compareTo(maximum)>0)
			maximum=b;
		if(c.compareTo(maximum)>0)
			maximum=c;
		return maximum;
	}

	public static void main(String[] args) 
	{
		Integer max1 = findMaxGeneric( 1,2,3 );
	    System.out.println("Maximum- 1,2,3 is: "+ max1);
	    
	    Double max2=findMaxGeneric( 1.1,3.3,2.2 );
	    System.out.println("Maximum- 1.1,3.3,2.2 is: "+max2);

	    String max3 = findMaxGeneric("Apple","Peach","Banana");
	    System.out.println("Maximum- Apple,Peach,Banana is: " +max3 );	
	}
}
