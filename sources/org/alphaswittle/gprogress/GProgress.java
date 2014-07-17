package org.alphaswittle.gprogress;

import org.lwjgl.opengl.GL11;

public class GProgress
{
    private float x, y;
    private int value;
    private int maxValue;
    private int spacing;
    private int affine;
    private Color backgroundColor;
    private Color foregroundColor;

    public GProgress(final float x, final float y, final int value, final int maxValue, final int spacing, final int affine)
    {
	this.x = x;
	this.y = y;
	this.foregroundColor = new Color(1, 1, 1, 1);
	this.backgroundColor = new Color(0, 0, 0, 0);
	this.value = value;
	this.maxValue = maxValue;
	this.spacing = spacing;
	this.affine = affine;
    }

    public void render()
    {
	GL11.glPushMatrix();
	{
	    GL11.glColor4f(this.backgroundColor.getRed(), this.backgroundColor.getGreen(), this.backgroundColor.getBlue(), this.backgroundColor.getAlpha());
	    GL11.glBegin(GL11.GL_QUADS);
	    {
		GL11.glVertex2f(this.x, this.y);
		GL11.glVertex2f(this.x + this.maxValue, this.y);
		GL11.glVertex2f(this.x + this.maxValue, this.y + this.affine);
		GL11.glVertex2f(this.x, this.y + this.affine);
	    }
	    GL11.glEnd();
	}
	GL11.glPopMatrix();
	GL11.glPushMatrix();
	{
	    GL11.glColor4f(this.foregroundColor.getRed(), this.foregroundColor.getGreen(), this.foregroundColor.getBlue(), this.foregroundColor.getAlpha());
	    GL11.glBegin(GL11.GL_QUADS);
	    {
		GL11.glVertex2f(this.x, this.y + this.spacing);
		GL11.glVertex2f(this.x + this.value, this.y + this.spacing);
		GL11.glVertex2f(this.x + this.value, (this.y + this.affine) - this.spacing);
		GL11.glVertex2f(this.x, (this.y + this.affine) - this.spacing);
	    }
	    GL11.glEnd();
	}
	GL11.glPopMatrix();
    }

    public void update()
    {
	this.value = this.getValue();
	if (this.value > this.maxValue)
	{
	    this.value = this.maxValue;
	}
    }

    public float getX()
    {
	return this.x;
    }

    public float getY()
    {
	return this.y;
    }

    public int getValue()
    {
	return this.value;
    }

    public int getMaxValue()
    {
	return this.maxValue;
    }

    public int getSpacing()
    {
	return this.spacing;
    }

    public int getAffine()
    {
	return this.affine;
    }

    public Color getBackgroundColor()
    {
	return this.backgroundColor;
    }

    public Color getForegroundColor()
    {
	return this.foregroundColor;
    }

    public void setX(final float x)
    {
	this.x = x;
    }

    public void setY(final float y)
    {
	this.y = y;
    }

    public void setValue(final int value)
    {
	this.value = value;
    }

    public void setMaxValue(final int maxValue)
    {
	this.maxValue = maxValue;
    }

    public void setSpacing(final int spacing)
    {
	this.spacing = spacing;
    }

    public void setAffine(final int affine)
    {
	this.affine = affine;
    }

    public void setBackgroundColor(final Color backgroundColor)
    {
	this.backgroundColor = backgroundColor;
    }

    public void setForegroundColor(final Color foregroundColor)
    {
	this.foregroundColor = foregroundColor;
    }
}