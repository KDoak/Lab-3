package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
private UUID GameID;
private UUID tableID;
private ArrayList<Player> GamePlayers = new ArrayList<Player>();

public Game(UUID gameID, UUID tableID, ArrayList<Player> gamePlayers) {
	super();
	GameID = gameID;
	this.tableID = tableID;
	GamePlayers = gamePlayers;
}

public UUID getGameID() {
	return GameID;
}

public void setGameID(UUID gameID) {
	GameID = gameID;
}

public UUID getTableID() {
	return tableID;
}

public void setTableID(UUID tableID) {
	this.tableID = tableID;
}

public ArrayList<Player> getGamePlayers() {
	return GamePlayers;
}

public void setGamePlayers(ArrayList<Player> gamePlayers) {
	GamePlayers = gamePlayers;
}

public ArrayList<Player> AddPlayerToTable(Table x, Player y){
	GamePlayers.add(y);
	return getGamePlayers();
}
}