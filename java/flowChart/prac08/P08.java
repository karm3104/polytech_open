public class P08 {
    public static void main(String[] args){
        System.out.println("自然数１を入力してください");
        int a = PConsole.inputIntNum();
        System.out.println("自然数２を入力してください");
        int b = PConsole.inputIntNum();

        int ans = a % b; 
        if(ans == 0){
            System.out.println(a+"は"+b+"の倍数です。");
        }else{
            System.out.println(a+"は"+b+"の非倍数です。");
        }
    }
}
