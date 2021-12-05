package io.ikka.utils;

public class DistanceUtils {

    /**
     * Calculate distance between two points in latitude and longitude taking
     * into account height difference. If you are not interested in height
     * difference pass 0.0. Uses Haversine method as its base.
     * <p>
     * lat1, lon1 Start point lat2, lon2 End point el1 Start altitude in meters
     * el2 End altitude in meters
     * <p>
     * source: https://stackoverflow.com/questions/3694380/calculating-distance-between-two-points-using-latitude-longitude
     * source: https://www.movable-type.co.uk/scripts/latlong.html
     *
     * @return Distance in Meters
     */
    public static double distance(double lat1, double lat2, double lon1, double lon2) {

        final int R = 6_371_000; // Radius of the earth in meters

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c;
    }
}
