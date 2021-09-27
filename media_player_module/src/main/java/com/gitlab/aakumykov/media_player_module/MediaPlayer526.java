package com.gitlab.aakumykov.media_player_module;

public class MediaPlayer526 {

    public interface Callbacks {
        void onPlay();
        void onPause();
    }

    private final Callbacks mCallbacks;

    public MediaPlayer526(Callbacks callbacks) {
        mCallbacks = callbacks;
    }

    public void play() {
        mCallbacks.onPlay();
    }

    public void pause() {
        mCallbacks.onPause();
    }
}
