import java.util.*;
public class Forest{

    private final List<Tree>trees = new ArrayList<>();

    public void getPlantTree(int x, int y, String name, String color, String texture)
    {
         TreeType type = TreeFactory.getType(name,color,texture);
         Tree tree = new Tree(x,y,type);

        trees.add(tree);
    }

    public void draw()
    {
        for(Tree tree:trees)
        {
            tree.draw();
        }
    }
}