/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author safwenBensaid
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GetTennisGameProgress extends JFrame implements ActionListener {

    TennisPlayer player1 = new TennisPlayer("player1", 0, 0, 0);
    TennisPlayer player2 = new TennisPlayer("player2", 0, 0, 0);
    JLabel mylabel = new JLabel("Appuyer sur le nom du joueur qui marque un point:   ");
    JTextArea textComponent = new JTextArea(9, 25);
    
    JButton p1Score = new JButton(player1.getName()); // construct a JButton1
    JButton p2Score = new JButton(player2.getName()); // construct a JButton2

    // constructor for ButtonFrame
    GetTennisGameProgress(String title) {
        super(title);                     // invoke the JFrame constructor
        add(mylabel);
        setLayout(new FlowLayout());      // set the layout manager
        p1Score.addActionListener(this); // register the Button1Frame object as the listener for the JButton.  
        p2Score.addActionListener(this); // register the Button2Frame object as the listener for the JButton.    
        Component add = add(p1Score); // add the button to the JFrame
        add(p2Score);                     // add the button to the JFrame

        add(new JScrollPane(textComponent));
        MessageConsole mc = new MessageConsole(textComponent);
        mc.redirectOut(null, System.out);
        mc.redirectErr(Color.RED, null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void getGameProgress(String player1Name, String player2Name) {
        System.out.println("Player  1 :  " + player1Name);
        System.out.println("Player  2 :  " + player2Name);
        System.out.println("Score : " + TennisGame.getMatchScore());
        System.out.println("Current game status : " + TennisGame.getGameStaus());
        System.out.println("Match Status : " + TennisGame.getMatchStaus() + "\n");
    }

    public void actionPerformed(ActionEvent evt) {
        if (TennisGame.getMatchStaus().equals("in progress")) {
            Object source = evt.getSource();
            TennisPlayer scoringPlayer = null;
            if (source == p1Score) {
                scoringPlayer = player1;
                getContentPane().setBackground(Color.GREEN);    // Change the Frame's background
            } else if (source == p2Score) {
                scoringPlayer = player2;
                getContentPane().setBackground(Color.WHITE);     // Change the Frame's background
            }
            System.out.println("------------------------------------------");
            System.out.println(scoringPlayer.getName()+" a marqué un point");
            System.out.println("------------------------------------------");
            TennisGame.marquePoint(scoringPlayer);
            TennisGame.getCurrentGameStatus(player1, player2);
            TennisGame.getScore(player1, player2);
            getGameProgress(player1.getName(), player2.getName()); 
            revalidate();
            repaint();  // ask the system to paint the screen.
        }
    }

    public static void main(String[] args) {
        GetTennisGameProgress myGame = new GetTennisGameProgress("Suivre mon match de tennis ");
        myGame.setSize(500, 250);
        myGame.setVisible(true);
    }

}
