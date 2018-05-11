public class A2 {
	public static void main(String[] args) {
		int hei = 175;
		int wei = 60;
		int bz;
		System.out.println("男：");
		bz = hei - 105;
		if(wei - bz >= -5 && wei - bz <= 5){
			System.out.println("该男子体重正常");
		}else if(wei - bz < -5){
			System.out.println("该男子体重偏瘦");
		}else if(wei - bz > 5){
			System.out.println("该男子体重超标");
		}
		System.out.println("女：");
		bz = hei - 110;
		if(wei - bz >= -5 && wei - bz <= 5){
			System.out.println("该女子体重正常");
		}else if(wei - bz < -5){
			System.out.println("该女子体重偏瘦");
		}else if(wei - bz > 5){
			System.out.println("该女子体重超标");
		}
	}
}
