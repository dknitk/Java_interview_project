package interview;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //   *   *
        //    * *
        //     *
        int row = 3;
        int col = 5;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                if(i == 0 && j == 0){
                    System.out.print("*");
                }else if(i == 0 && j == 4){
                    System.out.print("*");
                }else if(i == 1){
                    if(j % 2 == 0){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else if(i == 2 && j == 2){
                    System.out.print("*");
                }else if(i == 2 && j != 2){
                    System.out.print(" ");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }
}
