class Pascal_Triangle{
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            for(int j=1;j<i;j++){
                int sum=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                l.add(sum);

            }
            if(i>0){
                l.add(1);
            }
            list.add(l);
            
        }
        return list;

    }
}
