package istacktest;

public class FixedStack implements Istack{

	private int[] stack;
	private int tos;
	
	public FixedStack(int size) {
		stack = new int[size];
		tos = -1;
	}
	
	@Override
	public void push(int a) {
		if(tos == stack.length-1) {
			System.out.println(" �佺�� ��á���ϴ�.");
		}else {
			stack[++tos] = a;
			System.out.print(" "+stack[tos]);
		}
	}
	
	@Override
	public int pop() {
		if(tos == -1) {
			System.out.println(" ������ ������ϴ�. ");
		}else {
			System.out.print(" ");
		}
			
		return stack[tos--];
	}

	

}
