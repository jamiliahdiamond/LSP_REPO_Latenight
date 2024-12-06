package org.howard.edu.lsp.finalexam.question3;

//Singleton factory for creating shapes
public class ShapeFactory {
 // Single instance of ShapeFactory
 private static ShapeFactory instance;

 // Private constructor
 private ShapeFactory() {}

 // Get the single instance of ShapeFactory
 public static ShapeFactory getInstance() {
     if (instance == null) {
         instance = new ShapeFactory();
     }
     return instance;
 }

 // Create a shape based on the given type
 public Shape createShape(String shapeType) {
     if (shapeType == null) {
         return null;
     }
     if (shapeType.equalsIgnoreCase("CIRCLE")) {
         return new Circle();
     } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
         return new Rectangle();
     } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
         return new Triangle();
     }
     return null;
 }
}