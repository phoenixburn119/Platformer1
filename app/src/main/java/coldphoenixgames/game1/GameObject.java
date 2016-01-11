package coldphoenixgames.game1;

import android.graphics.Rect;

/**
 * Created by adamk on 1/10/2016.
 */
public abstract class GameObject
{
    protected int x;
    protected int y;
    protected int dy;
    protected int dx;
    protected int width;
    protected int height;

    public Rect getRectangel()
    {
        return new Rect(x, y, x+width, y+height);
    }





    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getHeight()
    {
        return height;
    }
    public int getWidth()
    {
        return width;
    }


}
