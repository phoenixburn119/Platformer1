package coldphoenixgames.game1;

import android.graphics.Bitmap;

/**
 * Created by adamk on 1/10/2016.
 */
public class Player extends GameObject
{
    private Bitmap spriteSheet;
    private int score;
    private double dya;
    private boolean;
    private boolean playing;
    private Animation animation = new Animation();
    private long startTime;

    public Player(Bitmap res, int w, int h, int numFrames)
    {
        x = 100;
        y = GamePanel.HEIGHT/2;
        dy = 0;
        score = 0;
        height = h;
        width = w;

        Bitmap[] image = new Bitmap[numFrames];

        for(int i = 0; i < image.length; i++)
        {
            
        }
    }
}
