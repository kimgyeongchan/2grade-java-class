package istacktest;

public class FixedStack2 implements Istack2{
	int[] array;
	int tos;
	
	public FixedStack2(int a) {
		array = new int[a];
		tos = -1;
	}

	@Override
	public void push(int a) {
		if(tos == array.length-1) {
			System.out.println("�� á���ϴ�");
		}else {
			array[++tos] = a;
			System.out.print(array[tos]+" ");
		}
	}

	@Override
	public int pop() {
		if(tos == -1) {
			System.out.println("�����");
			return 0;
		}else {
			System.out.print(array[tos]+" ");
			return array[tos--];
		}
	}


	

}
