package _24_interface;

public class ChannelUpButton extends Button {

    @Override
    public void onUp() {
        System.out.println("채널을 계속 올립니다.");
    }

    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    //ChannelDownButton
    //VolumeUpButton
    //VolumeDownButton
}