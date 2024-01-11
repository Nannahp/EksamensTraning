package image;

public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int height,int width){
        this.fileName = fileName;
        this.height = height;
        this.width  =width;
    }

    public  boolean isKnownFileType(){
            return fileName.endsWith(".gif") ||
                    fileName.endsWith(".jpg") ||
                    fileName.endsWith(".jpeg") ||
                    fileName.endsWith(".png") ||
                    fileName.endsWith(".webp") ||
                    fileName.endsWith(".bmp");
    }
    public boolean isPortrait(){
        if( this.height > this.width)
            return  true;
        else return  false;
    }
    public boolean isLandscape(){
        if( this.height < this.width)
            return  true;
        else return  false;
    }


}
