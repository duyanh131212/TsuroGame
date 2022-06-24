/** Project 4 testing
  * @author Arden Phan
  */
import org.junit.*;
import static org.junit.Assert.*;
public class Project4Testing{
  /** Test game board */
  
  // Test board and player window
  @Test
  public void testInitialize(){
    Tsuro game = new Tsuro(6,6,3,2);
    int[] boardSize = {6, 6};
    int handSize = 3;
    int numPlayer = 2;
    assertEquals(boardSize[0], game.getBoardSize()[0]);
    assertEquals(boardSize[1], game.getBoardSize()[1]);
    assertEquals(handSize, game.getHandSize());
    assertEquals(numPlayer, game.getNumPlayer());
  }
  
  /** Test tile function*/
  
  //Test rotate()
  @Test
  public void testRotate(){
    Tsuro game = new Tsuro(6,6,3,2);
    int[] a1 = new int[]{1, 0, 3, 2, 5, 4, 7, 6};
    int[] a2 = new int[]{1, 0, 3, 2, 5, 4, 7, 6};
    int[] b1 = new int[]{};
    int[] b2 = new int[]{};
    int[] c1 = new int[]{};
    int[] c2 = new int[]{};
    game.rotate(game.testTile);
    assertEquals(a2, game.testTile.getConnections());
  }
  
  
  //Test getTileIndex()
  @Test
  public void testGetTileIndex(){
    Tsuro game = new Tsuro(6,6,3,2);
    game.placeTile(2,3);
    int[] index = game.getTileIndex(game.testTile);
    assertEquals(2, index[0]);
    assertEquals(3, index[1]);
  }
  
  /** Test game function */
  
  //Test isLosing() method
  @Test
  public void testIsLosing(){
    Tsuro game = new Tsuro(6,6,3,2);
    game.placeTile(3,3);
    assertEquals(false,game.isLosing(game.testTile,4));
    game.placeTile(0,0);
    assertEquals(true,game.isLosing(game.testTile,6));
    game.placeTile(0,0);
    assertEquals(true,game.isLosing(game.testTile,1));
    game.placeTile(0,0);
    assertEquals(false,game.isLosing(game.testTile,3));
    game.placeTile(5,3);
    assertEquals(true,game.isLosing(game.testTile,2));
  }
  
  //Test getNextTile()
  @Test
  public void testGetNextTile(){
    Tsuro game = new Tsuro(6,6,3,2);
    
  }
  
  @Test
  public void testMoveStone(){
    Tsuro game = new Tsuro(6,6,3,2);
  }
  
  /** Test extra properties*/
  @Test
  public void testSettingChange(){
    Tsuro game = new Tsuro(6,6,3,2);
    String[] a = new String[]{"7 5 4 8"};
    //game.main(a);
    assertEquals(6, game.setting[0]);
    assertEquals(6, game.setting[1]);
    assertEquals(3, game.getHandSize());
    assertEquals(2, game.getNumPlayer());
  }
}