

class TableOfNum{
    public static void sq(int n,int count)
    {
        if(count==10)
        {
            System.out.println(n*count);
            return;
        }
        System.out.println(n*count);
        sq(n,count+1);
    }
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Main.sq(9,1);
    }
}