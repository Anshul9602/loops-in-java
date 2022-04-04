public class break_in_loop {
    public static void main(String[] args) {
           for(int i=0;i<10;i++){
                System.out.println(i);
                System.out.println("java");
                if(i==4){
                    System.out.println("end");
                    break;
                }
                i++;
            }
            System.out.println("java in"); 
    }    

}
