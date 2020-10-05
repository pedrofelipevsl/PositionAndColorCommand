public class ColorChangeCommand implements ICommand {

	public ColorChangeCommand(Rectangle rectangle, String newColor) {
		this.rectangle = rectangle;
		this.previousColor = rectangle.getCor();
		this.newColor = newColor;
	}

	@Override
	public void redo() {
		rectangle.setCor(newColor);

	}

	@Override
	public void undo() {
		rectangle.setCor(previousColor);
	}

	public String toString() {
		return "ColorChangeCommand[" + rectangle + ", " + previousColor + "->" + newColor + "]";
	}

	private Rectangle rectangle;
	private String previousColor;
	private String newColor;
}
