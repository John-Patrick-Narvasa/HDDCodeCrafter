
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener{
//Declaring all the variables
    //setting game resolution
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    //setting game size of the units such as snake and apple
    static final int UNIT_SIZE = 25;

    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    //setting game speed (75 is okay)
    static final int DELAY = 75;

    //2 arrays for holding the coordinates of all body parts of the snake
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    //determining how many body parts the snake has
    int bodyParts = 6;
    //determining the direction and apple of the snake
    int applesEaten;
    int appleX;
    int appleY;

    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    //setting game interface and functionalities
    GamePanel(){
        //setting game interface
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());

        startGame();
    }
    //declaring all the main functions of the game
    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if(running) {

        
            //drawing grid lines via for loop (as a scaffold)
            /*
            for (int i = 0; i < SCREEN_HEIGHT/UNIT_SIZE; i++) {
                g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
            }
            */

            //drawing apple
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            //drawing snake via for loop
            for(int i = 0; i < bodyParts; i++) {
                if(i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    //g.setColor(new Color(random.nextInt(255))); //for random colors (gay snake)
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            //scoreboard
            g.setColor(Color.red);
            g.setFont(new Font("Ink Free", Font.BOLD, 75));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten))/2, g.getFont().getSize());
        }
        //game over command via if else condition
        else {
            gameOver(g);
        }    
    }
    public void newApple() {
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }

    public void move() {
        //when the snake moves around the UI with a certain size
        for(int i = bodyParts; i > 0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        //what di
        switch(direction) {
            case 'U': 
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D': 
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L': 
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R': 
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }

    public void checkApple() {
        //checks if head collides with apple and adds a body part
        if((x[0] == appleX) && (y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }

    public void checkCollisions() {
        //checks if head collides with body
        for (int i = bodyParts; i > 0; i--) {
            if(x[0] == x[i] && y[0] == y[i]) {
                running = false;
            }
        }
        //check if head touches left border
        if(x[0] < 0) {
            running = false;
        }
        //check if head touches right border
        if(x[0] > SCREEN_WIDTH) {
            running = false;
        }
        //check if head touches top border
        if(y[0] < 0) {
            running = false;
        }
        //check if head touches bottom border
        if(y[0] > SCREEN_HEIGHT) {
            running = false;
        }
        //if not running, stop the timer
        if(!running) {
            timer.stop();
        }
    }
    public void gameOver(Graphics g) {
        //Display score text
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten))/2, g.getFont().getSize());

        //Game over text
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);

    }
    @Override //override - redefine
    public void actionPerformed(ActionEvent e) {
        
        if(running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    //so the snake won't eat itself when it turns 180 degrees (applies to the rest of directions)
                    if(direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction != 'U') {
                        direction = 'D';
                    }
                    break;
        }
      }

    }
}