
/**
 * Using methods to print
 * 
 * @author "Daniel Grimshaw" 
 * @version "9/8/14"
 * 
 * Answer to Question One:
 * 
I am method 1.
I am method 2.
I am method 3.
I am method 1.
I am method 1.
I am method 1.
I am method 2.
I am method 1.
I am method 2.
I am method 3.
I am method 1.
I am method 1.
I am method 2.
I am method 1.
 */
public class GrimshawLanterns {
    public static void main(String[] args) {
        GrimshawLanterns a = new GrimshawLanterns();
    }
    
    public GrimshawLanterns() {
        this.drawLanterns();
    }
    
    public void drawLanterns() {
        drawLantern(1);
        drawLantern(2);
        drawLantern(3);
    }

    private void drawLantern(int id) {
        switch (id) {
            case 1:
                drawHead(1);
                System.out.println();
                break;
            case 2:
                drawHead(1);
                drawBars(1);
                drawThirteenAst(1);
                drawHead(1);
                System.out.println();
                break;
            case 3:
                drawHead(1);
                drawFiveAst(1);
                drawThirteenAst(1);
                drawBars(2);
                drawThirteenAst(1);
                drawFiveAst(2);
                System.out.println();
                break;
            }
        }
        
    private int drawHead(int count) {
        if (count == 0) return 0;
        drawFiveAst(1);
        drawNineAst(1);
        drawThirteenAst(1);
        return drawHead(count - 1);
    }
        
    private int drawFiveAst(int count) {
        if (count == 0) return 0;
        System.out.println("    *****");
        return drawFiveAst(count - 1);
    }
    
    private int drawNineAst(int count) {
        if (count == 0) return 0;
        System.out.println("  *********");
        return drawNineAst(count - 1);
    }
    
    private int drawThirteenAst(int count) {
        if (count == 0) return 0;
        System.out.println("*************");
        return drawThirteenAst(count - 1);
    }
    
    private int drawBars(int count) {
        if (count == 0) return 0;
        System.out.println("* | | | | | *");
        return drawBars(count - 1);
    }
}
