class Waveform{
  void swap(int array[], int n, int m){
   int temp=array[n];
   array[n]=array[m];
   array[m]=temp;
}
  void sortInwave(int array[], int a){
  for(int i=0;i<a;i+=2){

  if(i>0 && array[i-1]>array[i])
  swap(array, i-1, i);
     if(i<a-1 && array[i]<array[i+1])
       swap(array, i, i+1);
} 
}
  public static void main(String[] args){
    Waveform ob=new Waveform();
int array[]= {4,8,3,9,10,1};
   int a= array.length;
   ob.sortInwave(array, a);
     for(int i: array)
     System.out.print(i+" ");
}

}