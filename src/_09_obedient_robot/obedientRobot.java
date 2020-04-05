package _09_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {

	static Robot lloyd = new Robot();
	public static void main(String[] args) {
	
		lloyd.setSpeed(255);
		String shape = JOptionPane.showInputDialog(null, "Which shape would you like? Square, Triangle, or Circle?");
String color = JOptionPane.showInputDialog(null, "Which color should my robot draw? Red, Blue, or Green?");

if(color.equalsIgnoreCase("red")) {
lloyd.setPenColor(255, 0, 0);

}
if(color.equalsIgnoreCase("blue")) {
lloyd.setPenColor(0, 0, 255);

}
if(color.equalsIgnoreCase("green")) {
lloyd.setPenColor(0, 255, 0);

}
if(shape.equalsIgnoreCase("square")) {
	drawSquare();
}
else if(shape.equalsIgnoreCase("triangle")) {
	drawTriangle();
}
else if(shape.equalsIgnoreCase("circle")) {
	drawCircle();
}
}
	
static void drawSquare() {
	lloyd.penDown();
	lloyd.turn(90);
	lloyd.move(200);
	lloyd.turn(90);
	lloyd.move(200);
	lloyd.turn(90);
	lloyd.move(200);
	lloyd.turn(90);
	lloyd.move(200);
	lloyd.penUp();
	
}
static void drawTriangle() {
lloyd.penDown();
lloyd.turn(120);
lloyd.move(200);
lloyd.turn(120);
lloyd.move(200);
lloyd.turn(120);
lloyd.move(200);
lloyd.penUp();
}

static void drawCircle() {
	lloyd.penDown();
	for (int i = 0; i < 361; i++) {
		lloyd.turn(1);
		lloyd.move(1);
	}
	lloyd.penUp();
}
}


