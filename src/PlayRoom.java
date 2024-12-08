import java.util.Arrays;
import java.util.Comparator;

public class PlayRoom {
    public static void main(String[] args) {
        Game.GameDisk[] physicalGames = {
            Game.getDisk("FIFA", Game.Genre.SPORT, "Football simulation"),
            Game.getDisk("Need for Speed", Game.Genre.RACE, "Racing game"),
            Game.getDisk("Call of Duty", Game.Genre.ACTION, "War game"),
            Game.getDisk("The Witcher", Game.Genre.ADVENTURE, "Fantasy RPG")
        };

        Game.VirtualGame[] virtualGames = {
            Game.getVirtualGame("Valorant", Game.Genre.ACTION),
            Game.getVirtualGame("Rocket League", Game.Genre.SPORT),
            Game.getVirtualGame("Cyberpunk", Game.Genre.ADVENTURE),
            Game.getVirtualGame("Forza Horizon", Game.Genre.RACE)
        };

        virtualGames[0].setRating(5);
        virtualGames[1].setRating(4);
        virtualGames[2].setRating(3);
        virtualGames[3].setRating(4);

        Arrays.sort(physicalGames, Comparator.comparing(o -> o.getData().getGenre()));
        Arrays.sort(virtualGames, Comparator.comparingInt(Game.VirtualGame::getRating).reversed());

        System.out.println("Фізичні ігри (відсортовані за жанром):");
        for (Game.GameDisk game : physicalGames) {
            System.out.println(game.getData().getName() + " (" + game.getData().getGenre() + ")");
        }

        System.out.println("\nВіртуальні ігри (відсортовані за рейтингом):");
        for (Game.VirtualGame game : virtualGames) {
            System.out.println(game.getData().getName() + " (Рейтинг: " + game.getRating() + ")");
        }

        GameConsole console = new GameConsole("Sony", "PS5-001");
        console.powerOn();
        console.getFirstGamepad().powerOn();
    }
}
