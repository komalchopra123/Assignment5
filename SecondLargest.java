class SecondLargest{
public static void main(String[] args){
int j,i,temp;
		int array[]={1,8,6,4,9,5};

	for(i=0;i<array.length-1;i++)
	{
		for(j=0;j<array.length-1;j++)
			{
		if(array[j]>array[j+1])
             {
               temp=array[j+1];
           array[j+1]=array[j];
           array[j]=temp;
          }}}
         
         System.out.print(array[4]);

           }
       }