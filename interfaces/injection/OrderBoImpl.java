package com.prince.spring.interfaces.injection;

public class OrderBoImpl implements OrderBo {
	
	private OrderDao orderDao;
	
	public void placeOrder() {
		System.out.println("Order Placed");
		orderDao.getOrder();
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	

}
