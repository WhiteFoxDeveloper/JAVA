import core.*;
import core.Camera;

public class RoadController
{
    public static double passengerCarMaxWeight = 3500.0; // kg  Переменная%      максимальный вес легкового авто
    public static int passengerCarMaxHeight = 2000; // mm   Переменная%      максимальная высота легкового авто
    public static int controllerMaxHeight = 3500; // mm     Переменная%      максимальная высота всех авто

    public static int passengerCarPrice = 100; // RUB       Переменная%      стоймость за легковой авто
    public static int cargoCarPrice = 250; // RUB           Переменная%      стоймость за грузовой авто
    public static int vehicleAdditionalPrice = 200; // RUB  Переменная%      Стоймость проезда

    public static int maxOncomingSpeed = 60; // km/h        Переменная%      максимальная скорость
    public static int speedFineGrade = 20; // km/h          Переменная%      ступенька ;D
    public static int finePerGrade = 500; // RUB            Переменная%      Это щтраф который в буд. будет * на каждую ступеньку(speedFineGrade) после maxOncomingSpeed
    public static int criminalSpeed = 160; // km/h          Переменная%      скорость при которой вызываеться полиция

    public static void main(String[] args)
    {

        for(Integer i = 0; i < 10; i++) // Переменная в цикле%                     //Цикл for повторяет 10 раз то что в {}.
        {                                                                          //
            Car car = Camera.getNextCar();                                         //Создаёт авто с разными характеристиками через Random. Car это класс
            System.out.println(car);                                               //Выводит все характеристики (масса, высота,  и т.д) созданые Random.
            System.out.println("Скорость: " + Camera.getCarSpeed(car) + " км/ч");  //Выводит только информацию о скорости авто.



            /**
             * Проверка на наличие номера в списке номеров нарушителей
             */
            boolean policeCalled = false;  //
            for (String criminalNumber : Police.getCriminalNumbers()) {
                String carNumber = car.getNumber();     //
                if (carNumber.equals(criminalNumber)) {
                    Police.call("автомобиль нарушителя с номером " + carNumber);
                    blockWay("не двигайтесь с места! За вами уже выехали!");
                    break;
                }
            }
            if (Police.wasCalled()) {
                continue;
            }

            /**
             * Проверка спецтранспорта.
             */

            if (car.isSpecial()) {
                openWay();
                continue;
            }

            /**
             * Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
             */
            int carHeight = car.getHeight(); //       Присвоение к переменной%
            int price = vehicleAdditionalPrice;//          Переменная%

            if(carHeight > controllerMaxHeight)
            {
                blockWay("высота вашего ТС превышает высоту пропускного пункта!");
                continue;
            }
            else if(carHeight > passengerCarMaxHeight)
            {
                double weight = WeightMeter.getWeight(car);// Присвоение к переменной%
                //Грузовой автомобиль
                if(weight > passengerCarMaxWeight){
                    price +=cargoCarPrice;               //      сложение Переменных%

                    if(car.hasVehicle()){
                        price += vehicleAdditionalPrice;//              сложение Переменных%

                }}
                //Легковой автомобиль
                else {
                    price += passengerCarPrice;//              сложение Переменных%
                }
            }
            else {
                price += passengerCarPrice;//              сложение Переменных%
            }



            /**
             * Проверка скорости подъезда и выставление штрафа
             */
            int carSpeed = Camera.getCarSpeed(car);//     Переменная%
            if(carSpeed > criminalSpeed)
            {
                Police.call("cкорость автомобиля - " + carSpeed + " км/ч, номер - " + car.getNumber());
                blockWay("вы значительно превысили скорость. Ожидайте полицию!");
                continue;
            }
            else if(carSpeed > maxOncomingSpeed)
            {
                int overSpeed = carSpeed - maxOncomingSpeed;//Переменная%
                int totalFine = finePerGrade * (1 + overSpeed / speedFineGrade);//Переменная%
                System.out.println("Вы превысили скорость! Штраф: " + totalFine + " руб.");
                price += totalFine;      //              сложение Переменных%
            }

            /**
             * Отображение суммы к оплате
             */
            System.out.println("Общая сумма к оплате: " + price + " руб."); //сложение Переменных%
        }

    }

    /**
     * Открытие шлагбаума
     */
    public static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    public static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }
}



/**1.for создаёт 10 авто с рандомными характеристиками через класс Car и выводит информацию характеристик
 * 2.Дальше проходят 4 проверки:
 *1) Проверка за номер авто, если номер есть в базе данных класса Police который создаёться Random'ом, то вызываеться полиция и дальше не проверяют.
 *2) Проверяется, специализирована ли эта машина, если да - то её пропускают и дальше не проверяют.
 *3) Проверка на высоту и массу авто, если машина выше 3.5 м то её не пропустят и дальше не проверяют, иначе вычисляют сумму проезда для грузовых и легковых авто.
 *4) Проверка на скорость подъезда и считывание штрафа, сначало проверяют скорость - если carSpeed > criminalSpeed, то вызывают полицию и дальше не проверяют.
 *   А если carSpeed > maxOncomingSpeed, тогда считывают штраф.
 *
 * 3.Считывание суммы и вывод на табло, открывают шлагбаум.
 *
 *
 *Для упращения кода использовались др. классы - Car, Police, WeightMeter, Camera.
 */


/**Исправил:
 * 1)Уменьшил высоту (passengerCarMaxWeight) до 3500 мм.
 * 2)Увеличил максимальную скорость подъезда (maxOncomingSpeed) до 60 км/ч.
 * 3)За грузовой автомобиль устоваливалась цена как на легковой, поэтому поменял. Устоновил начальную сумму price = 200 - стоймость проезда.
 * 4)Перенёс проверку спецтранспорта ниже проверки criminalNumber, чтобы не пропускало угнанный спецтранспорт.
 */

