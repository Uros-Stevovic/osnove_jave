package mini_projekat;

import java.util.ArrayList;

public class XandOGame extends Player {

	private ArrayList<String> table = new ArrayList<String>();

	private String nextPlayer;
	private Player playerX;
	private Player playerO;

	public XandOGame() {
		super();
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");

	}

	public XandOGame(Player playerX, Player playerO) {
		super();
		this.playerX = playerX;
		this.playerO = playerO;
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

	public void stampaj() {
		System.out.println(table.get(0) + " | " + table.get(1) + " | " + table.get(2) + " | ");
		System.out.println(table.get(3) + " | " + table.get(4) + " | " + table.get(5) + " | ");
		System.out.println(table.get(6) + " | " + table.get(7) + " | " + table.get(8) + " | ");
	}

	public void startGame() {
		table.set(0, " ");
		table.set(1, " ");
		table.set(2, " ");
		table.set(3, " ");
		table.set(4, " ");
		table.set(5, " ");
		table.set(6, " ");
		table.set(7, " ");
		table.set(8, " ");
		this.nextPlayer = "x";
	}

	public String isGameover() {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).equals("x") || table.get(i).equals("o")) {
				return "Igra je gotova. ";
			}

		}
		return "Mozete nastaviti igru";
	}

	public String isFieldFree(int pozicija) {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(pozicija).equals("x") || table.get(pozicija).equals("o")) {
				return "Polje nije slobodno. ";
			}
		}
		return "Polje je slobodno. ";

	}

	public String player() {
		if (this.nextPlayer.equals("x")) {
			return "x";
		} else {
			return "o";
		}
	}

	public void playNext() {
		if (this.nextPlayer.equals("x")) {
			this.nextPlayer = "o";
		} else if (this.nextPlayer.equals("o")) {
			this.nextPlayer = "x";
		}
	}

	public void makeMove(int pozicija) {
		table.set(pozicija, this.nextPlayer);
	}

	public boolean isWinnerX() {
		if (table.get(0).equals("x") && table.get(1).equals("x") && table.get(2).equals("x")) {
			return true;
		} else if (table.get(0).equals("x") && table.get(3).equals("x") && table.get(6).equals("x")) {
			return true;
		} else if (table.get(3).equals("x") && table.get(4).equals("x") && table.get(5).equals("x")) {
			return true;
		} else if (table.get(6).equals("x") && table.get(7).equals("x") && table.get(8).equals("x")) {
			return true;
		} else if (table.get(0).equals("x") && table.get(4).equals("x") && table.get(8).equals("x")) {
			return true;
		} else if (table.get(6).equals("x") && table.get(4).equals("x") && table.get(2).equals("x")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isWinnerO() {
		if (table.get(0).equals("o") && table.get(1).equals("o") && table.get(2).equals("o")) {
			return true;
		} else if (table.get(0).equals("o") && table.get(3).equals("o") && table.get(6).equals("o")) {
			return true;
		} else if (table.get(3).equals("o") && table.get(4).equals("o") && table.get(5).equals("o")) {
			return true;
		} else if (table.get(6).equals("o") && table.get(7).equals("o") && table.get(8).equals("o")) {
			return true;
		} else if (table.get(0).equals("o") && table.get(4).equals("o") && table.get(8).equals("o")) {
			return true;
		} else if (table.get(6).equals("o") && table.get(4).equals("o") && table.get(2).equals("o")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isValidMove(int pozicija) {
		if (pozicija >= 0 || pozicija < 9) {
			return true;
		}
		return false;
	}

	public int gameScore() {
		if (this.isWinnerX() == true) {
			return 1;
		} else if (this.isWinnerO() == true) {
			return 2;
		}
		return 0;
	}

}
