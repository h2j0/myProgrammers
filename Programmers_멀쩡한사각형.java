import java.util.*;

public class Programmers_멀쩡한각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ans = solution(a, b);  
	}

	public static long solution(long a, long b) {
		long W = Math.min(a, b); // 작은값
		long H = Math.max(a, b); // 큰값
		long g = 1;

		// 최대공약수 구하기
		if (H / W == 0) {
			g = W;
		} else {
			for (long i = 1; i <= W; i++) {
				if ((W % i == 0) && (H % i == 0)) {
					g = i;
				}
			}
		}

		long w = W / g;
		long h = H / g;

		long answer = W * H - (W + H - g);
		return answer;
	}

}
