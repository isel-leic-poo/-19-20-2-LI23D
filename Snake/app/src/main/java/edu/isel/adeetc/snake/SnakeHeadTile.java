package edu.isel.adeetc.snake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import pt.isel.poo.tile.Tile;

/**
 * Tile used to display the snake's head.
 */
class SnakeHeadTile implements Tile {

    private final Paint brush;

    public SnakeHeadTile() {
        brush = new Paint();
        brush.setStyle(Paint.Style.FILL_AND_STROKE);
        brush.setColor(Color.RED);
    }

    @Override
    public void draw(Canvas canvas, int side) {
        // TODO: (1) The snake's head should be displayed as a green square
        canvas.drawRect(4, 4, side-4, side-4, brush);
    }

    @Override
    public boolean setSelect(boolean selected) {
        return false;
    }
}