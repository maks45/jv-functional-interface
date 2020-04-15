package core.basesyntax;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод для сравнения мощности
 * двигателей у двух авто (enginePower) и возврата разницы между ними.
 * Метод должен принимать Integer.</p>
 */
public class CompareTwoAuto implements IntBinaryOperator {
    @Override
    public Integer apply(Integer power1, Integer power2) {
        return power1 - power2;
    }
}
