public class Wall {

    private double width;
    private double height;

    public Wall(){
     this(0,0);
    }

    public Wall(double width, double height) {
        if (width > 0) {
            //System.out.println(";;");
            this.width = width; }
        else
        {
            this.width = 0;
        }

        if (height > 0) {
            this.height = height;
        } else
        {
            this.height = 0;
        }
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            //System.out.println(";;");
            this.width = width; }
        else
        {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else
        {
            this.height = 0;
        }

    }
    public double getArea (){
        return height*width;
    }







    public static void main(String[] args) {
        Wall a = new Wall(-1.25,-1.25);
        System.out.println(a.width+" and "+a.height);
    }
}