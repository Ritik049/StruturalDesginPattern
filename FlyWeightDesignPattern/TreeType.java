public class TreeType{

    String name;
    String color;
    String texture;

   public TreeType(String name, String color, String texture)
   {
    this.name = name;
    this.color = color;
    this.texture =texture;
   }

   public void draw(int x,int y)
   {
    System.out.println("Drawing tree at "+ x+" and "+y+" with type "+"name "+name+" color "+color+" texture "+texture);
   }

}