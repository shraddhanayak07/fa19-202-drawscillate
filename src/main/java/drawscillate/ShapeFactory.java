package drawscillate;

public class ShapeFactory {

    public Shapes getShape(String type) {
        
        switch(type) {
        case "Heart": return new Heart();
        case "Star": return new Star();
        case "Rectangle": return new Rectangle();
        }
        return null;
        
    }
}