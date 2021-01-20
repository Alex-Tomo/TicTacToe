package TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    static int move = 1;
    static boolean gameOver = false;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("         ");
        displayBoard(sb.toString());
        checkCoordinates(sb);
    }

    public static void checkCoordinates(StringBuilder sb) {
        if(!gameOver) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the coordinates: ");
                String coordinates = scanner.nextLine();
                String[] splitCoordinates = coordinates.split(" ");
                int x = Integer.parseInt(splitCoordinates[0]);
                int y = Integer.parseInt(splitCoordinates[1]);
                if (x < 1 || x > 3 || y < 1 || y > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                }
                if (x == 1) {
                    if (y == 1) {
                        if (sb.charAt(0) == ' ') {
                            if (move % 2 == 0) {
                                sb.setCharAt(0, 'O');
                            } else {
                                sb.setCharAt(0, 'X');
                            }
                            move++;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else if (y == 2) {
                        if (sb.charAt(1) == ' ') {
                            if (move % 2 == 0) {
                                sb.setCharAt(1, 'O');
                            } else {
                                sb.setCharAt(1, 'X');
                            }
                            move++;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else if (y == 3) {
                        if (sb.charAt(2) == ' ') {
                            if (move % 2 == 0) {
                                sb.setCharAt(2, 'O');
                            } else {
                                sb.setCharAt(2, 'X');
                            }
                            move++;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    }
                } else if (x == 2) {
                    if (y == 1) {
                        if (sb.charAt(3) == ' ') {
                            if (move % 2 == 0) {
                                sb.setCharAt(3, 'O');
                            } else {
                                sb.setCharAt(3, 'X');
                            }
                            move++;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else if (y == 2) {
                        if (sb.charAt(4) == ' ') {
                            if (move % 2 == 0) {
                                sb.setCharAt(4, 'O');
                            } else {
                                sb.setCharAt(4, 'X');
                            }
                            move++;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else if (y == 3) {
                        if (sb.charAt(5) == ' ') {
                            if (move % 2 == 0) {
                                sb.setCharAt(5, 'O');
                            } else {
                                sb.setCharAt(5, 'X');
                            }
                            move++;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    }
                } else if (x == 3) {
                    if (y == 1) {
                        if (sb.charAt(6) == ' ') {
                            if (move % 2 == 0) {
                                sb.setCharAt(6, 'O');
                            } else {
                                sb.setCharAt(6, 'X');
                            }
                            move++;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else if (y == 2) {
                        if (sb.charAt(7) == ' ') {
                            if (move % 2 == 0) {
                                sb.setCharAt(7, 'O');
                            } else {
                                sb.setCharAt(7, 'X');
                            }
                            move++;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else if (y == 3) {
                        if (sb.charAt(8) == ' ') {
                            if (move % 2 == 0) {
                                sb.setCharAt(8, 'O');
                            } else {
                                sb.setCharAt(8, 'X');
                            }
                            move++;
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    }
                }
                displayBoard(sb.toString().toUpperCase());
                checkResult(sb);

            } catch (Exception ex) {
                System.out.println("You should enter numbers!");
                checkCoordinates(sb);
            }
        }
    }

    public static void displayBoard(String l_input) {
        System.out.println("---------");
        for(int i = 0; i < l_input.length(); i += 3) {
            System.out.print("| ");
            System.out.print(l_input.charAt(i)+" ");
            System.out.print(l_input.charAt(i+1)+" ");
            System.out.print(l_input.charAt(i+2)+" ");
            System.out.print("|\n");
        }
        System.out.println("---------");
    }

    public static void checkResult(StringBuilder sb) {
        String l_input = sb.toString();

        if(checkX(l_input)) {
            System.out.println("X wins");
            gameOver = true;
        } else if(checkO(l_input)) {
            System.out.println("O wins");
            gameOver = true;
        } else if(move == 10 && !gameOver){
            System.out.println("Draw");
            gameOver = true;
        } else if(!gameOver) {
            checkCoordinates(sb);
        }
    }

    public static boolean checkX(String l_input) {
        return (l_input.charAt(0) == 'X' && l_input.charAt(1) == 'X' && l_input.charAt(2) == 'X') ||
                (l_input.charAt(3) == 'X' && l_input.charAt(4) == 'X' && l_input.charAt(5) == 'X') ||
                (l_input.charAt(6) == 'X' && l_input.charAt(7) == 'X' && l_input.charAt(8) == 'X') ||
                (l_input.charAt(0) == 'X' && l_input.charAt(3) == 'X' && l_input.charAt(6) == 'X') ||
                (l_input.charAt(1) == 'X' && l_input.charAt(4) == 'X' && l_input.charAt(7) == 'X') ||
                (l_input.charAt(2) == 'X' && l_input.charAt(5) == 'X' && l_input.charAt(8) == 'X') ||
                (l_input.charAt(0) == 'X' && l_input.charAt(4) == 'X' && l_input.charAt(8) == 'X') ||
                (l_input.charAt(2) == 'X' && l_input.charAt(4) == 'X' && l_input.charAt(6) == 'X');
    }

    public static boolean checkO(String l_input) {
        return (l_input.charAt(0) == 'O' && l_input.charAt(1) == 'O' && l_input.charAt(2) == 'O') ||
                (l_input.charAt(3) == 'O' && l_input.charAt(4) == 'O' && l_input.charAt(5) == 'O') ||
                (l_input.charAt(6) == 'O' && l_input.charAt(7) == 'O' && l_input.charAt(8) == 'O') ||
                (l_input.charAt(0) == 'O' && l_input.charAt(3) == 'O' && l_input.charAt(6) == 'O') ||
                (l_input.charAt(1) == 'O' && l_input.charAt(4) == 'O' && l_input.charAt(7) == 'O') ||
                (l_input.charAt(2) == 'O' && l_input.charAt(5) == 'O' && l_input.charAt(8) == 'O') ||
                (l_input.charAt(0) == 'O' && l_input.charAt(4) == 'O' && l_input.charAt(8) == 'O') ||
                (l_input.charAt(2) == 'O' && l_input.charAt(4) == 'O' && l_input.charAt(6) == 'O');
    }
}

