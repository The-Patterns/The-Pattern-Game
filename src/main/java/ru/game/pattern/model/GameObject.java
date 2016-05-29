package ru.game.pattern.model;

import java.awt.*;
import java.awt.event.KeyListener;

/**
 * Created by Uskov Dmitry on 27.05.2016.
 */

/**
 * Родительский класс для всекх игровых обхъектов
 */
abstract public class GameObject {


    public abstract KeyListener getKeyListener();

    /**
     * В метожн происходит отрисовка объекта игры
     * @param g объект, на котором должна происходить отрисовка
     */
    abstract public void draw(Graphics2D g);

    /**
     * В методе должно происходить обновление состояния объекта
     * (например изменение положение его координат)
     */
    abstract public void update();

}
