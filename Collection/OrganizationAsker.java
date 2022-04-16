
package Collection;

import Data.*;

import java.util.Scanner;

public class OrganizationAsker {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float annualTurnover; //Значение поля должно быть больше 0
    private String fullName; //Значение этого поля должно быть уникальным, Длина строки не должна быть больше 1688, Поле не может быть null
    private long employeesCount; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле не может быть null
    private Address postalAddress; //Поле может быть null
}

    public void nameInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя: ");
            name = input.nextLine().trim();
            if (check.checkName(name) == 1) break;
            System.out.println("Некорректный ввод. Попробуйте еще раз.");
        }
    }

    public void xInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите координату x: ");
            if (input.hasNextFloat()) {
                x = input.nextFloat();
                if (check.checkCoordinateX(x) == 1) break;
            }
            System.out.println("Неверный формат ввода или число превышает " + Coordinates.getMaxX());
        }
    }

    public void yInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите координату y: ");
            if (input.hasNextFloat()) {
                y = input.nextFloat();
                if (check.checkCoordinateY(y) == 1) break;
            }
            System.out.println("Неверный формат ввода или число превышает " + Coordinates.getMaxY());
        }
    }

    public void realHeroInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Является героем: ");
            if (input.hasNextBoolean()) {
                realHero = input.nextBoolean();
                if(check.checkRealHero(realHero) == 1) break;
            }
            System.out.println("Введите либо true либо false!");
        }
    }

    public void hasToothpickInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Есть зубочистка: ");
            if (input.hasNextBoolean()) {
                hasToothpick = input.nextBoolean();
                break;
            }
            System.out.println("Введите либо true либо false!");
        }
    }

    public void impactSpeedInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите скорость: ");
            if (input.hasNextLong()) {
                impactSpeed = input.nextLong();
                break;
            }
            System.out.println("Введите целое число!");
        }
    }

    public void soundtrackInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя саундтрека: ");
            soundtrack = input.nextLine().trim();
            if (check.checkSoundtrackName(soundtrack) == 1) break;
            System.out.println("Неправильный ввод. Строка должна быть не пустой!");
        }
    }

    public void minutesOfWaitingInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите время ожидания: ");
            if (input.hasNextInt()) {
                minutesOfWaiting = input.nextInt();
                break;
            }

            System.out.println("Введите число!");
        }
    }

    public void weaponTypeInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите тип оружия. Возможные варианты - ");
            WeaponType.outputWeaponType();
            String inputWeaponType = input.nextLine().trim();

            if (check.checkWeaponType(inputWeaponType)== 1) {
                weaponType = WeaponType.valueOf(inputWeaponType);
                break;
            }
            System.out.println("Введите слово из предложенного списка.");
        }
    }

    public void carInput() {
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите марку машины: ");
            if (input.hasNextLine()) {
                car = input.nextLine().trim();
                if (check.checkCar(car) == 1) break;
            }

            System.out.println("Некорректный ввод.");
        }
    }

    public HumanBeing createElement(Long id) {
        return new HumanBeing(id, name, new Coordinates(x, y), realHero, hasToothpick, impactSpeed,
                soundtrack, minutesOfWaiting, weaponType, new Car(car));
    }

    public HumanBeing resultElement(Long id) {
        nameInput();
        xInput();
        yInput();
        realHeroInput();
        hasToothpickInput();
        impactSpeedInput();
        minutesOfWaitingInput();
        soundtrackInput();
        weaponTypeInput();
        carInput();

        return createElement(id);
    }

}