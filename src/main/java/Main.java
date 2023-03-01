import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;




public class Main {
    public static void main(String[] args) {


        //Here add the link for which you want to generate code QR

        String url = "";

        // Generate the QR code image as SVG bytes
        byte[] QrBytes = QRCode.from(url).withSize(250, 250).to(ImageType.JPG).stream().toByteArray();

        // Save file and write the path were you want to save file with QR Code
        File file = new File("");
        try {
            Files.write(file.toPath(), QrBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
