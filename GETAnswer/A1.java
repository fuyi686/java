public class A1 {
	public static void main(String[] args) {
		int sunD = 865000;
		int earthD = 7600;
		double sunV = 4 * Math.PI * Math.pow(sunD/2, 3) / 3;
		System.out.println(sunV);
		double b = Math.pow(sunD/2, 3) / Math.pow(earthD/2, 3);
		System.out.printf("%.2f", b);
	}
}
