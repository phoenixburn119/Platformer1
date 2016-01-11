package coldphoenixgames.game1;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by adamk on 1/10/2016.
 */
public class Background
{
    private Bitmap image;
    private int x, y, dx;

    public Background(Bitmap res)
    {
        image = res;
        dx = GamePanel.MOVESPEED;
    }
    public void update()
    {
        x+=dx;
        if(x<-GamePanel.WIDTH)
        {
            x=0;
        }
    }
    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(image, x, y, null);
        if(x<0)
        {
            canvas.drawBitmap(image, x+GamePanel.WIDTH, y, null);
        }
    }

}
