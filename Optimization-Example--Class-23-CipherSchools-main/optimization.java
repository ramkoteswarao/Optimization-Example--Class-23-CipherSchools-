
public class optimization {
    static boolean isprimeram(int n){
        if(n<1){
           return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
             if(n%i==0){
                return false;
             }
        }
        return true;
     }
     static boolean isprimeshyam(int n){
        if(n<1){
           return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
             if(n%i==0){
                return false;
             }
        }
        return true;
     }
      public static void main(String[] args) {
        int n=9999999;
        long start=System.currentTimeMillis();
        System.out.println(isprimeshyam(n));
        long end=System.currentTimeMillis();
        System.out.println("Time taken by Shyam:"+ (end-start));
       long start1=System.currentTimeMillis();
        System.out.println(isprimeram(n));
       long end1=System.currentTimeMillis();
        System.out.println("Time taken by ram:"+ (end1-start1));
        
      }
}
