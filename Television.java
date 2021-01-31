package com.company;

public class Television {
    private String productName;
    private boolean isOn;
    private int volume;
    private int channel;
    private int MINIMUM_volume;
    private int MAXIMUM_volume;
    private int MINIMUM_channel;
    private int MAXIMUM_channel;

    public Television(String productName) {
        this.productName = productName;
        volume = 0;
        channel = 1;
        isOn = false;
        MINIMUM_volume = 0;
        MAXIMUM_volume = 100;
        MINIMUM_channel = 1;
        MAXIMUM_channel = 50;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >= MINIMUM_volume && volume <= MAXIMUM_volume) {
            this.volume = volume;
            System.out.println("volume changed successfully");
        } else {
            System.out.println("Invalid volume given");
        }

    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel >= MINIMUM_channel && channel <= MAXIMUM_channel) {
            this.channel = channel;
            System.out.println("channel changed successfully");
        } else {
            System.out.println("Invalid channel given");
        }
    }

    public void toggleSwitch(){
         /* if (isOn == true);
        tv is on
                isOn = false
                else
        (isOn = true) */

        if(isOn == true){
            isOn = false;
        } else {
            isOn = true;
        }
    }

    public void increaseVolume(){
        if (volume >= MAXIMUM_volume){
            System.out.println("Maximum volume exceeded");
        } else {
            volume ++;
            System.out.println("volume successfully increased");
        }

    }

    public void decreaseVolume(){
        if(volume <= MINIMUM_volume){
            System.out.println("minimum volume exceeded");
        } else {
            volume --;
            System.out.println("volume successfully decreased");
        }

    }

    public void increaseChannel(){
        if(channel >= MAXIMUM_channel){
            System.out.println("maximum channel exceeded");
        } else {
            channel ++;
            System.out.println("channel successfully  changed");
        }

    }

    public void decreaseChannel(){
        if(channel <= MINIMUM_channel){
            System.out.println("maximum channel exceeded");
        } else {
            channel --;
            System.out.println("channel successfully  changed");
        }

    }


}

