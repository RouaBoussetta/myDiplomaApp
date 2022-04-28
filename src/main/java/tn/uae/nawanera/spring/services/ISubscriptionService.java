package tn.uae.nawanera.spring.services;

import com.stripe.exception.StripeException;

import tn.uae.nawanera.spring.entities.Notification;
import tn.uae.nawanera.spring.entities.Subscription;

public interface ISubscriptionService {
	public void createStripeCustomer(int idUser);
 
 	void chargeCustomer(String customerId, Subscription p, int amount) throws StripeException  ;
	String createCardForCustumorStripe(String customerId, Subscription p) throws StripeException;
	Notification addSubscriptionNotif(Subscription s);
	Notification addPaidSubscriptionNotif(Subscription s)  ;
 }
