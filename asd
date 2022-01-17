import java.util.Scanner;
public class Array {
	public static int add (int a, int b) {
		return a+b;
	}
	public static int avg (int a, int b) {
		return a+b/2;
	}
	public static int rankf(int a,int b,int rank) {
		if(a < b) rank++;
		return rank;
	}
	public static void prt(String a,int b,int c,int d,int e,int f) {
		System.out.print(" " +a+" ");
		System.out.print(b+" ");
		System.out.print(" "+c+" ");
		System.out.print(d+" ");
		System.out.print(e+" ");
		System.out.print(" "+f);
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = new int[4];
//		int[] b = {1,2,3};
		String[] c = {"사과","배","수박","딸기"};
//		System.out.println("a배열의 크기:"+ a.length);
//		System.out.println("b배열의 크기:"+ b.length);
		
//		for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]+" ");
//		}
//		System.out.println();
		
//		for(int i : b) {
//			System.out.print(i+" ");
//		}
//		System.out.println(c[2]);
		String[] name = new String[2];
		int[] KorG = new int[2];
		int[] EngG = new int[2];
		int[] SumG = new int[2];
		int[] AvgG = new int[2];
		int[] rankG = new int[2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<name.length;i++) {
			System.out.print("성명을 입력하세요: ");
			name[i] = sc.next();
			System.out.print("국어 점수을 입력하세요: ");
			KorG[i] = sc.nextInt();
			System.out.print("영어 점수을 입력하세요: ");
			EngG[i] = sc.nextInt();
			SumG[i] = add(KorG[i],EngG[i]);
			AvgG[i] = avg(KorG[i],EngG[i]);
		}
		for(int i = 0;i<name.length;i++) {
			int rank = 1;
			for(int j = 0;j<name.length;j++) {
				//if(SumG[i] < SumG[j]) rank++;
				rank = rankf(SumG[i],SumG[j],rank);
			}
			rankG[i] = rank;
		}
		System.out.println("==========================");
		System.out.println("  성명 국어 영어 합계 평균 석차");
		System.out.println("==========================");
		for(int i = 0;i<name.length;i++) {
			prt(name[i],KorG[i],EngG[i],SumG[i],AvgG[i],rankG[i]);
		}
	}
}
