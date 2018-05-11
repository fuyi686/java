public class A6 {
	public static void main(String[] args) throws IndexOutOfBoundsException, NullPointerException{
		try{
			int[] arr = new int[6];
			arr[6] = 1;
		}catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		try{
			String a = null;
			if(a.equals("a")){
				System.out.println(true);
			}else{
				System.out.println(false);
			}
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}
}
