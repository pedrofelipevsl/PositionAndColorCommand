class Rectangle {

	public Rectangle(int x, int y, String cor) {
		this.x = x;
		this.y = y;
		this.cor = cor;
	}
	
	private int y;
	private int x;
	private String cor;
	
	public String getCor() { return cor; }
	public int getX() { return x; }
	public int  getY() { return y; }
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
}