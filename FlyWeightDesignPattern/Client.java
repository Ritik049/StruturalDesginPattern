public class Client
{
    public static void main(String[]args)
    {
       Forest forest = new Forest();
       forest.getPlantTree(10, 10, "tree1","color1", "texture1");
       forest.getPlantTree(20,20,"tree2","color2","texture2");
       forest.getPlantTree(30,30, "tree1","color1","texture1");

       forest.draw();

       

    }
}