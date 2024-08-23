import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class FolderRenamer {
    public static void main(String[] args) {
        Path directory = Paths.get("C:/Users/PC_Chen/Desktop/coding/LeetCode");

        try (Stream<Path> paths = Files.walk(directory, 1)) {
            paths.filter(Files::isDirectory)
                    .forEach(FolderRenamer::renameFolder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void renameFolder(Path originalPath) {
        Path parent = originalPath.getParent();
        String folderName = originalPath.getFileName().toString();

        if (folderName.equals(parent.getFileName().toString())) {
            // Ignore the parent directory itself
            return;
        }

        String newName = formattedFolderName(folderName);
        Path newPath = parent.resolve(newName);

        try {
            Files.move(originalPath, newPath);
            System.out.println("Renamed from " + originalPath + " to " + newPath);
        } catch (IOException e) {
            System.out.println("Failed to rename " + originalPath + " to " + newPath);
            e.printStackTrace();
        }
    }

    private static String formattedFolderName(String folderName) {
        int dashIndex = folderName.indexOf('-');
        String numericPart = dashIndex > 0 ? folderName.substring(0, dashIndex) : folderName;
        String suffix = dashIndex > 0 ? folderName.substring(dashIndex) : "";

        try {
            int num = Integer.parseInt(numericPart);
            numericPart = String.format("%04d", num);
        } catch (NumberFormatException e) {
            System.out.println("Skipping non-numeric folder: " + folderName);
            return folderName; // Return original name if it's not numeric
        }

        return numericPart + suffix;
    }
}
