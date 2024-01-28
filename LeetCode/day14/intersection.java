class Demo{

	int[] intersection(){

		ArrayList<Integer> al=new ArrayList<>();
                ArrayList<Integer> al2=new ArrayList<>();

                for(int i=0;i<arr1.length;i++){
                        al.add(arr1[i]);
                }
                int count=0;
                for(int i=0;i<arr2.length;i++){
                        if(al.contains(arr2[i]) && !al2.contains(arr2[i])){
                                al2.add(arr2[i]);
                                count++;
                        }
                }
                int arr3[]=new int[count];
                for(int i=0;i<arr3.length;i++){
                        arr3[i]=al2.get(i);
                }

                return arr3;
	}
}
