/* package whatever; // don't place package name! */

import java.util.LinkedList;
import java.util.ListIterator;


public class MultiplyLinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> operand1 = new LinkedList<Integer>();
        LinkedList<Integer> operand2 = new LinkedList<Integer>();
        operand1.addLast(new Integer(1));
        operand1.addLast(new Integer(2));
        operand1.addLast(new Integer(3));
        operand2.addLast(new Integer(4));
        operand2.addLast(new Integer(5));
        operand2.addLast(new Integer(6));
        boolean success = multiply(operand1, operand2);
        if (success) {
            System.out.print("The result of the multiplication is: ");
            System.out.println(operand2);
        } else {
            System.out.println("The two numbers could not be multiplied.");
        }
    }
    public static boolean multiply(LinkedList<Integer> operand1, LinkedList<Integer> operand2) {
        // Edge case yields no change
        if (operand1 == null || operand2 == null) {
            return false;
        }
        int operand1Len = operand1.size();
        int operand2Len = operand2.size();
        int bothOperandsLen = operand1Len + operand2Len;
        // Move digits from operand 2 to the end of operand 1
        while (!operand2.isEmpty()) {
            operand1.addLast(operand2.removeFirst());
        }
        // Rename linked lists for clarity
        LinkedList<Integer> bothOperands = operand1;
        LinkedList<Integer> answer = operand2;
        // Initialize answer to 0
        answer.add(0);
        ListIterator<Integer> operand2Iter = bothOperands.listIterator(bothOperandsLen);
        // Iterate over second operand's digits in reverse order
        for (int i = 0; i < operand2Len; i++) {
            int operand2Digit = operand2Iter.previous().intValue();
            ListIterator<Integer> operand1Iter = bothOperands.listIterator(operand1Len);
            // Iterate over first operand's digits in reverse order
            for (int j = 0; j < operand1Len; j++) {
                int operand1Digit = operand1Iter.previous().intValue();
                int product = operand1Digit * operand2Digit;
                int shiftAmount = i + j;
                // Add the intermediate product to the answer list
                add(answer, product, shiftAmount);
            }
        }
        return true;
    }
    private static void add(LinkedList<Integer> result, int product, int shiftAmount) {
        int resultLen = result.size();
        for (int insertPositionFromRight = shiftAmount; product != 0; insertPositionFromRight++) {
            int digit = product % 10;
            product /= 10;
            int numNodesNeeded = insertPositionFromRight - resultLen + 1;
            // Expand the width of the answer linked list if necessary
            for (int i = 0; i < numNodesNeeded; i++) {
                result.addFirst(0);
            }
            resultLen = result.size();
            // Add the current digit of the product to the corresponding node in the answer
            int resultIndex = resultLen - insertPositionFromRight - 1;
            int curVal = result.get(resultIndex).intValue();
            int newVal = curVal + digit;
            // Carry if necessary
            if (newVal > 10) {
                newVal -= 10;
                product++;
            }
            result.set(resultIndex, newVal);
        }
    }
}

