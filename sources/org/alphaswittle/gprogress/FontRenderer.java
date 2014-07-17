package org.alphaswittle.gprogress;

import java.awt.Color;
import java.awt.Font;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;

public class FontRenderer
{
    private UnicodeFont font;

    @SuppressWarnings("unchecked")
    public FontRenderer(String fontName, int size, Color color)
    {
	this.font = new UnicodeFont(new Font(fontName, Font.PLAIN, size));
	this.font.addAsciiGlyphs();
	this.font.getEffects().add(new ColorEffect(color));
	try
	{
	    this.font.loadGlyphs();
	} catch (SlickException e)
	{
	    e.printStackTrace();
	}
    }

    public void drawString(float x, float y, String text)
    {
	font.drawString(x, y, text);
    }

    public int getWidth(String s)
    {
	return font.getWidth(s);
    }

    public int getHeight(String s)
    {
	return font.getHeight(s);
    }

    public UnicodeFont getFont()
    {
	return font;
    }

    public void setFont(UnicodeFont font)
    {
	this.font = font;
    }
}
