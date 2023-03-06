package spring_basic2.part1_SimpleExample.order;

public interface OrderService {
    Order createOrder(Long memberId, String productName, int productPrice);
}
