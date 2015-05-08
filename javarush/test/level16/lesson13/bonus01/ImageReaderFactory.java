package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Administrator on 08.05.15.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes n)
    {
        ImageReader reader;
        if(n ==ImageTypes.JPG)
            reader = new JpgReader();
        else if (n ==ImageTypes.BMP)
            reader = new BmpReader();
        else if (n ==ImageTypes.PNG)
            reader = new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");

        return reader;
    }
}
