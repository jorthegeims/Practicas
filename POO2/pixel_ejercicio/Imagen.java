package POO2.pixel_ejercicio;

public class Imagen {

    private Pixel[][] matrizPixels;
//    private byte filas;
//    private byte pixelesF;

    public  Imagen (int filas, int pixelesF){

        matrizPixels = new Pixel[filas][pixelesF];

    }

    public void setPixel(int red,int green,int blue, int n, int m) {
        matrizPixels[n][m] = new Pixel(red,green,blue);
    }

    public void setPixel(Pixel pixel, byte n, byte m) {
        matrizPixels[n][m] = pixel;
    }

    public Pixel[][] getMatrizPixels() {
        return matrizPixels;
    }

    public void getImagen(){

        for (Pixel[] filapPixels : matrizPixels) {

            for (Pixel pixel : filapPixels) {
                
                System.out.println("rojo " + pixel.getRed() + " verde " + pixel.getGreen() + " blue " + pixel.getBlue());

            }
            
        }

    }

}
