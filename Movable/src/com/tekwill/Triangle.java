package com.tekwill;

import com.tekwill.Point;
import com.tekwill.Polygon;

public class Triangle extends Polygon {

    public Triangle(Point p1, Point p2, Point p3) {
        vertices = new Point[]{p1, p2, p3};
    }

    @Override
    public void moveUp(int distance) {
        for (Point vertex : vertices) {
            vertex.setY(vertex.getY() + distance);
        }
    }

    @Override
    public void moveDown(int distance) {
        for (Point vertex : vertices) {
            vertex.setY(vertex.getY() - distance);
        }
    }

    @Override
    public void moveLeft(int distance) {
        for (Point vertex : vertices) {
            vertex.setX(vertex.getX() - distance);
        }
    }

    @Override
    public void moveRight(int distance) {
        for (Point vertex : vertices) {
            vertex.setX(vertex.getX() + distance);
        }
    }
}