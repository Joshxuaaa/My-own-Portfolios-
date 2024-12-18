public class hola{
    public static void main(String [] args){
        
        int [] a= {2,4,5,3,13,5,2,13,1};
        int [] sheshh={2,4,1,3,5,3,5,3};

        for(int i=0; i<a.length-1; i++){
            sheshh[i]= i;
        }
        for(int indexnumbers: sheshh)
        System.out.println(indexnumbers);
    }
}