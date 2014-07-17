package org.alphaswittle.gprogress;

public class Color
{
    protected float red;
    protected float green;
    protected float blue;
    protected float alpha;

    public Color(float red, float green, float blue, float alpha)
    {
	this.red = red;
	this.green = green;
	this.blue = blue;
	this.alpha = alpha;
    }

    public float getRed()
    {
	return red;
    }

    public float getGreen()
    {
	return green;
    }

    public float getBlue()
    {
	return blue;
    }

    public float getAlpha()
    {
	return alpha;
    }

    public void setRed(float red)
    {
	this.red = red;
    }

    public void setGreen(float green)
    {
	this.green = green;
    }

    public void setBlue(float blue)
    {
	this.blue = blue;
    }

    public void setAlpha(float alpha)
    {
	this.alpha = alpha;
    }
}