package com.sahu.solid.lsp.solution;

public class Facebook implements SocialMedia, SocialPostAndMediaManager, VideoCallManager {

    @Override
    public void chatWithFriend() {
        // Implementation for chatting with friends
    }

    @Override
    public void sendPhotosAndVideos() {
        // Implementation for sending photos and videos
    }

    @Override
    public void publishPost(Object post) {
        // Implementation for publishing a post
    }

    @Override
    public void groupVideoCall(String... users) {
        // Implementation for group video call
    }
}
