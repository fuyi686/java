public class A2 {
	public static void main(String[] args) {
		int hei = 175;
		int wei = 60;
		int bz;
		System.out.println("�У�");
		bz = hei - 105;
		if(wei - bz >= -5 && wei - bz <= 5){
			System.out.println("��������������");
		}else if(wei - bz < -5){
			System.out.println("����������ƫ��");
		}else if(wei - bz > 5){
			System.out.println("���������س���");
		}
		System.out.println("Ů��");
		bz = hei - 110;
		if(wei - bz >= -5 && wei - bz <= 5){
			System.out.println("��Ů����������");
		}else if(wei - bz < -5){
			System.out.println("��Ů������ƫ��");
		}else if(wei - bz > 5){
			System.out.println("��Ů�����س���");
		}
	}
}
