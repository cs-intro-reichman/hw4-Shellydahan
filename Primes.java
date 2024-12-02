public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean [] primes= new boolean[n-1];
        for(int i = 2; i < primes.length; i++)
           primes[i]=true;
        int p=2;
        int count=0;
        while(p <= Math.sqrt(n)){
          if(primes[p]=true){
            for(int i = p+1; i < primes.length; i++){
              if(primes[i]=true){
                 if(i%p==0){
                primes[i]=false;
                count++;
               }
              }   
            }
          }  
        p++;
        }
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (count/n)*100 + "% are primes)");
    }
}