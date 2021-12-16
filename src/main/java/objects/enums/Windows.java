package objects.enums;

public enum Windows {

    START("activityChoice", "Choix de l'activité");

    private final String path;
    private final String title;

    Windows(String pathName, String matchingTitle){
        this.path = pathName;
        this.title = matchingTitle;
    }

    @Override
    public String toString(){
        return this.path;
    }

    public String getTitle() {
        return title;
    }
}