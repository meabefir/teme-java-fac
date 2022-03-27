package ro.unibuc.pao.homework;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class ZigZagLine extends Line {

    ArrayList<Point> m_points = new ArrayList<Point>();

    public ZigZagLine(List<Point> points) {
        for (Point p: points) {
        	m_points.add(new Point(p.getX(), p.getY()));
        }
    }

    public ZigZagLine(Point... points) {
    	for (Point p: points) {
        	m_points.add(new Point(p.getX(), p.getY()));
        }
    }

    public void addPoint(Point point) {
    	m_points.add(new Point(point.getX(), point.getY()));
    }

    public int getLength() {
    	if (m_points.size() < 2)
    		return 0;
        int len = 0;
        Point current = m_points.get(0);
        for (int i = 1; i < m_points.size(); i++) {
        	Point next = m_points.get(i);
        	len += Math.sqrt(Math.pow(current.getX() - next.getX(), 2) + Math.pow(current.getY() - next.getY(), 2));
        			
        	current = next;
        }
        return len;
    }

}
