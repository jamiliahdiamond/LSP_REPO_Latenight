package org.howard.edu.lsp.finalexam.question3;

//Class for rendering shapes
public class ShapeRenderer {
 // ShapeFactory instance
 private ShapeFactory shapeFactory;

 // Constructor
 public ShapeRenderer() {
     this.shapeFactory = ShapeFactory.getInstance();
 }

 // Method to render a shape
 public void renderShape(String shapeType) {
     Shape shape = shapeFactory.createShape(shapeType);
     if (shape != null) {
         shape.draw();
     } else {
         System.out.println("Unknown shape type: " + shapeType);
     }
 }

 // Main method to demonstrate shape rendering
 public static void main(String[] args) {
     ShapeRenderer renderer = new ShapeRenderer();

     // Render different shapes
     renderer.renderShape("circle");
     renderer.renderShape("rectangle");
     renderer.renderShape("triangle");
     renderer.renderShape("hexagon");
 }
}