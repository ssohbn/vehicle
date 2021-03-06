package root.stuff.sprites.vehicles;

import root.Sketch;
import root.stuff.interfaces.ICollide;
import root.stuff.util.Bounds;
import root.stuff.util.Color;
import root.stuff.util.Position;
import root.stuff.util.Size;
import root.stuff.util.Speed;

public class Car extends Vehicle {

	/**
     * simple vehicle
     * it go vroom :)
     */
    public Car(Position position, Sketch sketch) {
		super(position, sketch);
        this.position = position;
        this.color = new Color(255, 0, 0);
		this.new_constants();
		this.sketch = sketch;
    }

    /**
     * colorful vroom vroom
     */
    public Car(Position position, Color color, Sketch sketch) {
		super(position, sketch);
        this.position = position;
        this.color = color;
		this.new_constants();
	}

	private void new_constants() {
        this.size  = new Size(64, 48);
        this.speed = new Speed(4, 0);
	}

    @Override
    public void move() {
        this.position.add(this.speed);
    }

    public void move(Speed speed) {
        this.position.add(speed); 
    }

    @Override
    public void draw() {
        int wheelSize = 16;

        sketch.pushMatrix();
        sketch.fill(this.color.r, this.color.g, this.color.b, 255);
        sketch.rect(this.position.x, this.position.y, this.size.width, this.size.height);

        sketch.fill(0);
        // left block wheel
        sketch.rect(this.position.x, this.position.y + this.size.height, wheelSize, wheelSize);
        // right block wheel
        sketch.rect(this.position.x + this.size.width - wheelSize, this.position.y + this.size.height, wheelSize, wheelSize);

        sketch.popMatrix();   
    }

	public Bounds getBounds() {
		return new Bounds(this.position, this.size);
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	@Override
	public Position getPosition() {
		return this.position;
	}

	@Override
	public Size getSize() {
		return this.size;
	}

	@Override
	public void onCollide(ICollide collider) {
		System.out.println("car collided with " + collider);
	}
}
