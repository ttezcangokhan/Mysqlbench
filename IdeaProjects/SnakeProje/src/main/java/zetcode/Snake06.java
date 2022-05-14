package zetcode;

import java.io.PrintStream;

public class Snake06 {

    class Main {
        static final int MAX_WIDTH = .., MAX_HEIGHT = ..;

        PrintStream out;

        //create coordinates for head, tail, apple
        //create array of the whole snake
        //create variables with: score, speed, direction, apple

        Main() {
            out = new PrintStream(System.out);

            //initialize speed
        }

        void start() {
            setSpeed(speed);
            out.printf("Press an arrow to start the game\n");
            //set in start position
            while (true) {
                game();
            }
        }

        void setStartPosition() {
            score = 0;
            direction = apple = null;
            newSnake();
            appleCheck();
        }

        void game() {
            if (//arrow is pressed) {
                    processEvent(//arrow);
        } else {
            //method: check if there has to be a new apple
            //method: delete the current snake
            //method: you can go through the "walls"/sides
            //method: determine direction
            //method: place (new) snake
            //method: check if you are game over
            showChanges();
        }
    }
    void processEvent(Event event) {
        if (//arrow left) {
        if (//direction is not right) {
        direction = "left";
    }
} else if (//arrow right) {
        if (//direction is not left) {
        direction = "right";
        }
        } else if (//arrow up) {
        if (//directon is not down) {
        direction = "up";
        }
        } else if (//arrow down) {
        if (//direction is not up) {
        direction = "down";
        }
        }
        }

        void deleteCurrentSnake() {
        //loop through the whole snake array and delete every element
        }

        void appleCheck() {
        if (appleResult() == "true") {
        setApple();
        //place on the obtained coordinates an apple
        out.printf("score= %d\n", score);
        }
        }

        String appleResult() {
        if (//start position) {
        apple = "true";
        } else if (//you hit the apple) {
        apple = "true";
        score++;
        snake.numberOfElements++;
        } else {
        apple = "false";
        }
        return apple;
        }

        void setApple() {
        Random randomGenerator = new Random();
        coordinateApple = new Coordinate(randomGenerator.nextInt(MAX_WIDTH), randomGenerator.nextInt(MAX_HEIGHT));
        if (//apple is placed on the snake) {
        setApple();
        }
        }

        void makePermeableSides() {
        if (coordinateHeadSnake != null) {
        if (//direction is right and coordinateHeadSnake.x is bigger than the width) {
        coordinateHeadSnake = new Coordinate(-1, coordinateHeadSnake.y);
        } else if (//direction is left and coordinateHeadSnake.x <= 0) {
        coordinateHeadSnake = new Coordinate(MAX_WIDTH, coordinateHeadSnake.y);
        } else if (//direction is down and coordinateHeadSnake.x is bigger than the height) {
        coordinateHeadSnake = new Coordinate(coordinateHeadSnake.x, -1);
        } else if (//direction is up and coordinateHeadSnake.x <= 0) {
        coordinateHeadSnake = new Coordinate(coordinateHeadSnake.x, MAX_HEIGHT);
        }
        }
        }

        void setDirection() {
        if (//not direction not null) {
        if (//direction left) {
        coordinateHeadSnake = new Coordinate(coordinateHeadSnake.x - 1, coordinateHeadSnake.y);
        } else if (//direction right) {
        coordinateHeadSnake = new Coordinate(coordinateHeadSnake.x + 1, coordinateHeadSnake.y);
        } else if (//direction up) {
        coordinateHeadSnake = new Coordinate(coordinateHeadSnake.x, coordinateHeadSnake.y - 1);
        } else if (//direction down) {
        coordinateHeadSnake = new Coordinate(coordinateHeadSnake.x, coordinateHeadSnake.y + 1);
        }
        snake.moveSnake(coordinateHeadSnake);
        }
        }

        void placeSnake() {
        //place the whole snake array
        }

        void checkGameOver() {
        if (// the snake hits itself) {
        out.printf("Game Over -_-\n" + "Press an arrow to start another game\n");
        //clear the whole field
        //reset ==> go to start position
        }
        }
        void newSnake() {
        coordinateHeadSnake = new Coordinate(0,1);
        coordinateTail = new Coordinate(0,0);
        snake = new Snake();
        snake.addCoordinateAtTheBack(coordinateHeadSnake);
        snake.addCoordinateAtTheBack(coordinateTail);
        }

        void place(int x, int y, Object type) {
        //method that places a new element in the game
        }

        void showChanges() {
        //method that shows your array
        }
        void setSpeed(speed) {
        //method that sets framesPerSecond to speed you want
        }

public static void main(String[] args) {
        new Main().start();
        }
        }
}
