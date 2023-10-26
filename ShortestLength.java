public class ShortestLength{
    public static void main(String[] args) {
       String a= "WNEENESENNN";
       String b= "NS";
       pathfinder(b);
       pathfinder(a);
    }
    public static void pathfinder(String a){
         int b[]= {0,0};
         double x=0;
        for(int i=0;i<a.length();i++){
           if(a.charAt(i)=='N')
           b[1]+=1;
           else if(a.charAt(i)=='S')
           b[1]-=1;
           else if(a.charAt(i)=='E')
           b[0]+=1;
           else if(a.charAt(i)=='W')
           b[0]-=1;
            }
           x= Math.sqrt(Math.pow(b[0], 2)+Math.pow(b[1], 2)); //it will produce result in double format
           System.out.println("shortest distance is "+x);
        }
        
        
    }
