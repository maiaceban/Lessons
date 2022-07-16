public enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

   final int level;
    DangerLevel(int danger){
        this.level = danger;
    }

    public int getLevel(){
        return level;
    }

}
