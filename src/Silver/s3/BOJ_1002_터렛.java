package Silver.s3;

import java.util.Scanner;

public class BOJ_1002_터렛 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();

			int dis = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1); // 좌표 사이의 거리
			int sum = (r1 + r2) * (r1 + r2); // 두 원의 반지름 길이의 합(제곱)
			int sub = (r1 - r2) * (r1 - r2); // 두 원 반지름 길이의 차 (제곱)

			if (x1 == x2 && y1 == y2 && r1 == r2) // 두 원이 일치
				System.out.println(-1);
			else if (dis == sum || dis == sub) // 내접 또는 외접
				System.out.println(1);
			else if (dis > sum || dis < sub) // 안 만남
				System.out.println(0);
			else
				System.out.println(2); // 두 점에서 만남

		}
	}

}
