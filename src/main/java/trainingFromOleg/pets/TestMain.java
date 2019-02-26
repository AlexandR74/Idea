package trainingFromOleg.pets;

public class TestMain {
    public static void main(String[] args) {
        Pet kotVaska = new Pet();
        System.out.println(kotVaska.getName());
        //Будет имя Vaska;
        System.out.println(kotVaska.getPetState()); //Будет I have name
        // Идея мне говорит, что я не совсем правильно делаю,
        // что пытаюсь получить поле petState через инстанс класса, а не через его имя. по хорошему я должен был бы написать
        System.out.println(Pet.getPetState()); //Будет I have name

        Pet sobakaSharik = new Pet();
        System.out.println(sobakaSharik.getName()); //Будет имя Vaska потому что я его назначил и не менял
        System.out.println(sobakaSharik.getPetState()); //здесь тоже Будет I have name

        Pet homyakPetka = new Pet();
        System.out.println(homyakPetka.getName()); //И снова будет имя Vaska потому что я его не менял
        System.out.println(homyakPetka.getPetState()); //и здесь Будет I have name

        //теперь мы наченм менять имена и состояние
        kotVaska.setName("Kot Vaska");
        sobakaSharik.setName("Sobaka Shairk");
        homyakPetka.setName("Homyak Petka");

        System.out.println(kotVaska.getName() + " | " + sobakaSharik.getName() + " | " + homyakPetka.getName());
        //вот уже у кжадого будет свое имя
        System.out.println(kotVaska.getPetState() + " | " + sobakaSharik.getPetState() + " | " + homyakPetka.getPetState());
        //но состояние у всех по прежнему одно
        //теперь мы поменяем состояние у кота Васьки
        kotVaska.setPetState("Теперь я точно кот и у меня есть имя Васька");
        //А теперь посмотрим на состояние всех объектов
        System.out.println(kotVaska.getPetState() + " | " + sobakaSharik.getPetState() + " | " + homyakPetka.getPetState());
        //и выходит что состояние мы поменяли только у кота, а котами Васьками стали все
        //теперь если мы обратимся к статик переменно (как положено, т.е  как правильно)  через имя класса
        Pet.setPetState("Я теперь вообще хрен знает кто...Жопокрылый семихуй!");
        System.out.println(kotVaska.getPetState() + " | " + sobakaSharik.getPetState() + " | " + homyakPetka.getPetState());
        //Все наши питомцы станут непойми кем
        //Т.е. статик переменная, она одна на все экземпляры класса, и её изменение приведет к изменению этой переменной
        // во всех созданных в программе экземплярах класса, неважно где бы они не находились.
    }
}