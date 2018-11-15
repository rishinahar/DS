
public class CheckIfDestinationisReachableWithtwoMovements {

	public static boolean checkIfDestinationisReachableWithtwoMovements (int x1, int y1, int x2 , int y2) 
	{
		if (x1 == x2  && y1 == y2)
			return true;
		
		else if (x1 > x2  || y1 > y2)
		    return false;
		
		return (checkIfDestinationisReachableWithtwoMovements(x1, x1+y1, x2, y2) ||
		checkIfDestinationisReachableWithtwoMovements(x1+y1, y1, x2, y2));
		
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkIfDestinationisReachableWithtwoMovements(2,5 , 12 ,7));
	}

}
