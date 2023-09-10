import controller.ItemController;
import model.Item;
import view.ItemView;
import view.MainMenu;

public class App {
    public static  void main(String[] args) throws Exception {
        ItemController controller = new ItemController();
        ItemView view = new ItemView();
        MainMenu mainMenu = new MainMenu(controller, view);

        // Thêm các mục vào danh sách
        controller.addItem(new Item(1, "Item 1"));
        controller.addItem(new Item(2, "Item 2"));
        controller.addItem(new Item(3, "Item 3"));

        mainMenu.display();
    }
    }

