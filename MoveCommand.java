public class MoveCommand implements ICommand {
	public MoveCommand(Rectangle rectangle, int newX, int newY) {
		this.rectangle = rectangle;
		this.previousX = rectangle.getX();
		this.previousY = rectangle.getY();
		this.newX = newX;
		this.newX = newY;
	}

	@Override
	public void redo() {
		rectangle.setX(newX);
		rectangle.setY(newY);

	}

	@Override
	public void undo() {
		rectangle.setX(previousX);
		rectangle.setY(previousY);
	}

	public String toString() {
		return "MoveCommand[" + rectangle + ", (" + previousX + ", " + previousY + ") ->" + ", (" + newX + ", " + newY + ") ]";
	}

	private Rectangle rectangle;
	private int previousX;
	private int  previousY;
	private int  newX;
	private int  newY;
}
