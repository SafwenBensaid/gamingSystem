/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author 04494
 */
public class TennisGameTest {
    
    public TennisGameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMatchScore method, of class TennisGame.
     */
    @Test
    public void testGetMatchScore() {
        System.out.println("getMatchScore");
        String expResult = "(0-0)";
        String result = TennisGame.getMatchScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMatchScore method, of class TennisGame.
     */
    @Test
    public void testSetMatchScore() {
        System.out.println("setMatchScore");
        String matchScore = "";
        TennisGame.setMatchScore(matchScore);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMatchStaus method, of class TennisGame.
     */
    @Test
    public void testGetMatchStaus() {
        System.out.println("getMatchStaus");
        String expResult = "in progress";
        String result = TennisGame.getMatchStaus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMatchStaus method, of class TennisGame.
     */
    @Test
    public void testSetMatchStaus() {
        System.out.println("setMatchStaus");
        String matchStaus = "";
        TennisGame.setMatchStaus(matchStaus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGameStaus method, of class TennisGame.
     */
    @Test
    public void testGetGameStaus() {
        System.out.println("getGameStaus");
        String expResult = "0-0";
        String result = TennisGame.getGameStaus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGameStaus method, of class TennisGame.
     */
    @Test
    public void testSetGameStaus() {
        System.out.println("setGameStaus");
        String gameStaus = "";
        TennisGame.setGameStaus(gameStaus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of marquePoint method, of class TennisGame.
     */
    @Test
    public void testMarquePoint() {
        System.out.println("marquePoint");
        TennisPlayer tennisPlayer = new TennisPlayer("player1", 0, 0, 0);
        TennisGame.marquePoint(tennisPlayer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of gagnerGame method, of class TennisGame.
     */
    @Test
    public void testGagnerGame() {
        System.out.println("gagnerGame");
        TennisPlayer winnerPlayer = new TennisPlayer("player1", 0, 0, 0);
        TennisPlayer loserPlayer = new TennisPlayer("player1", 0, 0, 0);
        TennisGame.gagnerGame(winnerPlayer, loserPlayer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of gagnerSet method, of class TennisGame.
     */
    @Test
    public void testGagnerSet() {
        System.out.println("gagnerSet");
        TennisPlayer winnerPlayer = new TennisPlayer("player1", 0, 0, 0);
        TennisPlayer loserPlayer = new TennisPlayer("player2", 0, 0, 0);
        String gainedSetDetails = "";
        TennisGame.gagnerSet(winnerPlayer, loserPlayer, gainedSetDetails);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class TennisGame.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        TennisPlayer Player1 = new TennisPlayer("player1", 0, 0, 0);
        TennisPlayer Player2 = new TennisPlayer("player2", 0, 0, 0);
        TennisGame.getScore(Player1, Player2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentGameStatus method, of class TennisGame.
     */
    @Test
    public void testGetCurrentGameStatus() {
        System.out.println("getCurrentGameStatus");
        TennisPlayer Player1 = new TennisPlayer("player1", 0, 0, 0);
        TennisPlayer Player2 = new TennisPlayer("player2", 0, 0, 0);
        TennisGame.getCurrentGameStatus(Player1, Player2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][]{
            {0, 0, "0-0"},
            {1, 1, "15-15"},
            {2, 2, "30-30"},
            {3, 3, "Deuce"},
            {4, 4, "Deuce"},
            {1, 0, "15-0"},
            {0, 1, "0-15"},
            {2, 0, "30-0"},
            {0, 2, "0-30"},
            {3, 0, "40-0"},
            {0, 3, "0-40"},
            {4, 0, "player1 wins the game"},
            {0, 4, "player2 wins the game"},
            {2, 1, "30-15"},
            {1, 2, "15-30"},
            {3, 1, "40-15"},
            {1, 3, "15-40"},
            {4, 1, "player1 wins the game"},
            {1, 4, "player2 wins the game"},
            {3, 2, "40-30"},
            {2, 3, "30-40"},
            {4, 2, "player1 wins the game"},
            {2, 4, "player2 wins the game"},
            {4, 3, "Advantage for player1"},
            {3, 4, "Advantage for player2"},
            {5, 4, "Advantage for player1"},
            {4, 5, "Advantage for player2"},
            {6, 4, "player1 wins the game"},
            {4, 6, "player2 wins the game"},});
    }
}
