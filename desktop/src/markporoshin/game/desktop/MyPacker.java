package markporoshin.game.desktop;

/**
 * Created by Mark on 22.10.2016.
 */
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
public class MyPacker {
    public static void main (String[] args) throws Exception {
        TexturePacker.process("C:\\libGDX\\desktop", "C:\\libGDX\\desktop\\packer", "images.pack");
    }
}