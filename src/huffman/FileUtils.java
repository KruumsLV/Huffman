/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtils {
    public static void readFileIntoStringBuild(StringBuilder sb, String filePath) {
        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> sb.append(s).append("\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
    
    public static String getExtension(String fileName) {
        String extension = "";
        int index = fileName.lastIndexOf('.');
        if (index >= 0) {
            extension = fileName.substring(index + 1);
        }
        return extension;
    }
}
