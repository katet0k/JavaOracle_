package task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileComparator {
    public static void compareFiles(String path1, String path2) throws IOException {
        List<String> file1Lines = Files.readAllLines(Path.of(path1));
        List<String> file2Lines = Files.readAllLines(Path.of(path2));

        int maxLines = Math.max(file1Lines.size(), file2Lines.size());

        for (int i = 0; i < maxLines; i++) {
            String line1 = i < file1Lines.size() ? file1Lines.get(i) : "Немає рядка";
            String line2 = i < file2Lines.size() ? file2Lines.get(i) : "Немає рядка";

            if (!line1.equals(line2)) {
                System.out.printf("Несумісність у рядку %d:%nФайл 1: %s%nФайл 2: %s%n", i + 1, line1, line2);
            }
        }
    }
}
