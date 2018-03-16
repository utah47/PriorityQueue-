package rmuti.PriorityQueue;


public class TestArrayListPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("001", "name", 20_000);
		Employee emp2 = new Employee("002", "name", 30_000);
		Employee emp3 = new Employee("003", "name", 15_000);
		
		ArrayListPQ arrayListPQ = new ArrayListPQ();
		arrayListPQ.enqueue(emp1);
		arrayListPQ.enqueue(emp2);
		arrayListPQ.enqueue(emp3);
		
		System.out.println(arrayListPQ);
		
		arrayListPQ.dequeue();
		System.out.println(arrayListPQ);
		
		arrayListPQ.dequeue();
		System.out.println(arrayListPQ);
		
		arrayListPQ.enqueue(new Employee("004", "name", 40_000));
		System.out.println(arrayListPQ);
		}

}