import java.util.Scanner;
class Game{
    int userinput;
    int compinput;
    int count;
    public Game(){
       compinput = (int)(Math.random()*100);
    }
        public void setNum(int n){
            userinput = n;
        }
        public int isCorrect(){
            if(userinput > compinput) {
                return -1;
            }
            else if(userinput < compinput) {
                return 1;
            }
            else {
                return 0;
            }
        }
        public void Counter(){
            count++;
        }
    }
    public class ch9 {
        public static void main(String[] args) {
            Game num = new Game();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true){
            System.out.println("enter number");
            n = sc.nextInt();
            num.setNum(n);

            if (num.isCorrect() ==0) {
                System.out.println("congo!!! your number is right");
                System.out.println("no.of counts" + num.count);
                break;
            }
                else if(num.isCorrect() ==1){
                    num.Counter();
                    System.out.println("oops!! you entered a wrong no. higher no. please");
                }
                else if(num.isCorrect() == -1){
                    num.Counter();
                    System.out.println("oops !! you entered a wrong no. smaller no. please");
                }
            }
        }
    }