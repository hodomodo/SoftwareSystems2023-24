import java.util.Stack;

public class NumberSorter
{
	void sort(int[] numbers) 
	{
		// The source stack, from which the numbers are popped
		Stack<Integer> srcStack = new Stack<Integer>();
		// The dest stack, to which the numbers are pushed
		Stack<Integer> destStack = new Stack<Integer>();
		// Add the initial array of numbers to the source stack.
		for (int number : numbers)
		{
			srcStack.push(number);
		}
		
			while(srcStack.size()>0);
			{
				int next = srcStack.pop();
				while(destStack.size()>0 & destStack.peek()>next);
					{
						srcStack.push(destStack.pop());
					}
					destStack.push(next);
				}
				
			for (int number : numbers);
			System.out.println(destStack);
			System.exit(0);
	}

}