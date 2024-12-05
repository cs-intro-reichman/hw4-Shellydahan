public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] primes= new boolean[n+1];
        for(int i = 2; i < primes.length; i++)
           primes[i]=true;
        int p=2;
        while(p <= Math.sqrt(n)){
          if(primes[p]==true){
            for(int i = p+1; i < primes.length; i++){
              if(primes[i]==true){
                 if(i%p==0){
                    primes[i]=false;
                 }
              }   
            }
          }  
          p++;
        }
        int primeCount = 0;
        for(int i = 2; i <= n; i++){
            if(primes[i])
                primeCount++;
        }
    
        
        System.out.println("Prime numbers up to " + n + ":"); 
        
        
        for (int i = 2; i <= n; i++) { 
            if (primes[i]) {
                System.out.println(i); 
            }
        }
        int totalNumbers = n; 
        double percentage = ((double)primeCount / totalNumbers) * 100;
        int primesPercentage = (int)Math.floor(percentage);
        System.out.println("There are " + primeCount + " primes between 2 and " + n + " (" + primesPercentage + "% are primes)");
    }
}