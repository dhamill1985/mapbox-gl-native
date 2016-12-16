package com.mapbox.mapboxsdk.exceptions;


import android.content.Context;
import android.os.Bundle;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;

/**
 * A MapboxAccountManagerNotStartedException is thrown by {@link com.mapbox.mapboxsdk.maps.MapView}
 * when {@link Mapbox} is not started before {@link MapView#onCreate(Bundle)}.
 *
 * @see MapView#onCreate(Bundle)
 * @see Mapbox#start(Context, String)
 */
public class MapboxAccountManagerNotStartedException extends RuntimeException {

    public MapboxAccountManagerNotStartedException() {
        super("\nMapbox was not started correctly. Use Mapbox#start(Context, String) to initialise. " +
                "\nMore information in this guide https://www.mapbox.com/help/first-steps-android-sdk/#access-tokens.");
    }
}
