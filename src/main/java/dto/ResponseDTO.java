package dto;


public class ResponseDTO {

    private String response;
    private Boolean continueDialogueOnFile;
    private String pathToFollow;

    public String getResponse() {
        return response;
    }

    public Boolean getContinueDialogueOnFile() {
        return continueDialogueOnFile;
    }

    public String getPathToFollow() {
        return pathToFollow;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setContinueDialogueOnFile(Boolean continueDialogueOnFile) {
        this.continueDialogueOnFile = continueDialogueOnFile;
    }

    public void setPathToFollow(String pathToFollow) {
        this.pathToFollow = pathToFollow;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "response='" + response + '\'' +
                ", continueDialogueOnFile=" + continueDialogueOnFile +
                ", pathToFollow='" + pathToFollow + '\'' +
                '}';
    }
}
