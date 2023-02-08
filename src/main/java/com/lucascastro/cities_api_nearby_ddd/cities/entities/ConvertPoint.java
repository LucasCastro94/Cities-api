package com.lucascastro.cities_api_nearby_ddd.cities.entities;

import jakarta.persistence.AttributeConverter;
import org.springframework.data.geo.Point;


public class ConvertPoint implements AttributeConverter<Point, String> {

  @Override
  public String convertToDatabaseColumn(Point point) {
    if (point == null) {
      return null;
    }
    return point.getX() + "," + point.getY();
  }

  @Override
  public Point convertToEntityAttribute(String dbData) {
    if (dbData == null) {
      return null;
    }

    String str = dbData.replace("(","").replace(")","").trim();
    String[] xy = str.split(",");
    double x = Double.parseDouble(xy[0]);
    double y = Double.parseDouble(xy[1]);
    return new Point(x, y);
  }
}


