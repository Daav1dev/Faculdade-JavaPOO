package Aula6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<>();

        carrinho.add(new Mouse("Mouse Otico", "Saida USB 1.600dpi"));
        carrinho.add(new Manga("seinen", "Vagabond"));

        carrinho.add(new Mouse("Mouse Gamer", "Saida USB 12.600dpi"));
        carrinho.add(new Manga("seinen", "Berserk"));

        carrinho.add(new Mouse("Mouse Bluetooth", "Saida USB 1.600dpi"));
        carrinho.add(new Manga("shounen", "One piece"));

        carrinho.add(new Manga("shounen", "Jujutu Kaisen"));
        carrinho.add(new Manga("seinen", "Monster"));

        for(int i=0;i<carrinho.size();i++){
            System.out.println(carrinho.get(i).getDescricao());
        }
    }
}
