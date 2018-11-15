package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class GasStation {


	public int canCompleteCircuitNotClockwise(int[] gas, int[] cost) {

		int result = -1;
		int gasAvailable =0;

		HashMap<Integer, Integer> gasCost = new HashMap ();
		HashMap<Integer, Integer> gasIndex = new HashMap ();


		for (int i=0; i<gas.length;i++)
		{
			gasCost.put(gas[i], cost[i]);
			gasIndex.put(gas[i],i);

		}

		Arrays.sort(gas);


		for (int i= gas.length-1; i >=0;i--)
		{
			int costOut = gasCost.get(gas[i]);
			int gasIn = gas[i];

			gasAvailable += gasIn;
			if (gasAvailable < costOut)
				return -1;
			else
				gasAvailable = gasAvailable- costOut;
		}

		return gasIndex.get(gas[gas.length-1]);
	}

	public int canCompleteCircuitDep(int[] gas, int[] cost , int result , int gasAvailable) {
		
		int j = (result +1) % gas.length ;

		while( j !=  result)
		{

			int costOut = cost[j];
			int gasIn = gas[j];

			gasAvailable += gasIn;

			if (gasAvailable < costOut)
				return -1;

			gasAvailable = gasAvailable - costOut;

			j = (j +1) % gas.length ;
		}
		return result;
	}

	public int canCompleteCircuit(int[] gas, int[] cost) {

		int result = -1;
		int gasAvailable =0;

		for (int i= 0; i <gas.length;i++)
		{
			int costOut = cost[i];
			int gasIn = gas[i];

			gasAvailable = gasIn;
			if (gasAvailable < costOut)
				continue;
			else
			{
				result = i;
				gasAvailable = gasAvailable - costOut;
				
				result = canCompleteCircuitDep(gas, cost, result, gasAvailable);
				
				if (result != -1)
					return result;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] gas  = {5,1,2,3,4};
		int[] cost = {4,4,1,5,1};

		System.out.println(new GasStation().canCompleteCircuit(gas, cost));
	}

}
