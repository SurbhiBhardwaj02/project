public class Box {
    int width,height,depth;
    Box(int w,int h,int d ){
        this.width=w;
        this.height=h;
        this.depth=d;
    }
    static int volumeOfBox(int width, int height,int depth){
        int v=width*height*depth;
        return v;
    }

    public static void main(String[] args) {
        Box obj=new Box(3,4,5);
        System.out.println(obj.depth);
        System.out.println(obj.width);
        System.out.println(obj.height);
        System.out.println(volumeOfBox(3,4,5));
    }
}
