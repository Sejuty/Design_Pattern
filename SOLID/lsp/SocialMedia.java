package SOLID.lsp;

interface SocialMedia {
    void Chat();

    void sendPhotosAndVideos();
}

interface PostMedia {
    void publishPost();
}

interface VideoCall {
    void videoCall();
}

class Instragram implements SocialMedia,PostMedia{
    @Override
    public void Chat() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void publishPost() {

    }
}

class WhatsApp implements SocialMedia,VideoCall{
    @Override
    public void Chat() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void videoCall() {

    }
}