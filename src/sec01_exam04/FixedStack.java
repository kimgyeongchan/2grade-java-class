package sec01_exam04;

public class FixedStack implements Istack{
	private int[] stack;
	private int tos;
	
	public FixedStack(int size) {
		this.stack = new int[size];
		this.tos = -1;
	}
	
	@Override
	public void push(int a) {
		if(tos==stack.length-1) {
			System.out.println(" 스택이 꽉 찼습니다.");
		}else {
			tos++;
			stack[tos] = a;
			System.out.print(" "+stack[tos]);
		}
	}
	@Override
	public int pop() {
		if(tos==-1) {
			System.out.println(" 스택이 비어있습니다.");
			return 0;
		}else {
			System.out.print(" "+stack[tos]);
			return stack[tos--];
		}
	}
}
