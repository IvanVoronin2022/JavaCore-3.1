import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static StringBuilder history = new StringBuilder();

    public static void main(String[] args) throws IOException {
        File dirGames = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games");
        if (dirGames.mkdir()) {
            history.append("Создана папка " + new Date().toString() + "\n");
        }
        File dirSrc = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\src");
        if (dirSrc.mkdir()) {
            history.append("Создана папка " + new Date().toString() + "\n");
        }
        File dirRes = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\res");
        if (dirRes.mkdir()) {
            history.append("Создана папка " + new Date().toString() + "\n");
        }
        File dirSaveGames = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\savegames");
        if (dirSaveGames.mkdir()) {
            history.append("Создана папка " + new Date().toString() + "\n");
        }
        File dirTemp = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\temp");
        if (dirTemp.mkdir()) {
            history.append("Создана папка " + new Date().toString() + "\n");
        }
        File dirMain = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\src\\main");
        if (dirMain.mkdir()) {
            history.append("Создана папка " + new Date().toString() + "\n");
        }
        File dirTest = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\src\\test");
        if (dirMain.mkdir()) {
            history.append("Создана папка " + new Date().toString() + "\n");
        }
        File main = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\src\\main\\Main.java");
        try {
            if (main.createNewFile()) {
                history.append("Создан файл " + new Date().toString() + "\n");
            }
        } catch (IIOException ex) {
            System.out.println(ex.getMessage());
        }
        File utils = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\src\\main\\Utils.java");
        try {
            if (utils.createNewFile()) {
                history.append("Создан файл " + new Date().toString() + "\n");
            }
        } catch (IIOException ex) {
            System.out.println(ex.getMessage());
        }
        File dirDrawables = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\res\\drawables");
        if (dirDrawables.mkdir()) {
            history.append("Создана папка " + new Date().toString() + "\n");
        }
        File dirVectors = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\res\\vectors");
        if (dirVectors.mkdir()) {
            history.append("Создана папка " + new Date().toString() + "\n");
        }
        File dirIcons = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\res\\icons");
        if (dirIcons.mkdir()) {
            history.append("Создана папка " + new Date().toString() + "\n");
        }
        File temp = new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\temp\\temp.txt");
        try {
            if (temp.createNewFile()) {
                history.append("Создан файл " + new Date().toString() + "\n");
            }
        } catch (IIOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\JavaCore_1.3\\Games\\temp\\temp.txt")) {
            writer.write(String.valueOf(history));
            writer.flush();
        } catch (IIOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}