package br.pro.hashi.ensino.desagil.tequilada;

public class Player {
	private int row;
	private int col;
	
	public Player(int initialRow, int initialCol){
		row = initialRow;
		col = initialCol;
	}
	
	public void move(int rowShift, int colShift) {
		row += rowShift;
		col += colShift;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
}
