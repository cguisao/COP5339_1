/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_6_2;

import java.awt.Graphics2D;

/**
 *
 * @author Carlos Guisao
 */
public abstract class SelectableShape implements SceneShape
{
    @Override
    public void setSelected(boolean b)
    {
        selected = b;
    }

    @Override
    public boolean isSelected()
    {
        return selected;
    }

    @Override
    public abstract void drawSelection(Graphics2D g2);

    private boolean selected;
}
