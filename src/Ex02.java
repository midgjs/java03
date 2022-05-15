
public class Ex02 {

	public static void main(String[] args) {
		int numOfApples = 123; //사과의 개수
		int sizeOfBucket = 10; //바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
		
		System.out.println("필요한 바구니의수 : " + numOfBucket);
		
		
		// 조건식 ? 식1 : 식2
		// true이면 식1 / false면 식2
	}

}
