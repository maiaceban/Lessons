public interface Flying {
    // returns height of flying in meters
    int getHeight();

    // implements a default method getHeightInKm that
    default void getHeightInKm() {
        System.out.println("Default method");
    }

    // returns height of flying in km as int type

/**
 * There is an interface Flying that has a method getHeight returning the height of
 * flying in meters. Add and implement a default method getHeightInKm that returns
 * height of flying in kilometers.
 */

}
