package com.javarush.task.task11.task16.task1631;

import com.javarush.task.task11.task16.task1631.common.*;




public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes) {
        if (imageTypes == ImageTypes.BMP) {
            return new BmpReader();
        } else if (imageTypes == ImageTypes.JPG) {
            return new JpgReader();
        } else if (imageTypes == ImageTypes.PNG) {
            return new PngReader();
        }
        throw new IllegalArgumentException();
    }
}
