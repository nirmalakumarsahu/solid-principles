package com.sahu.solid.lsp.problem;

public class WhatsApp implements SocialMedia {
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {
        // NOT SUPPORTED — violates substitution
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
