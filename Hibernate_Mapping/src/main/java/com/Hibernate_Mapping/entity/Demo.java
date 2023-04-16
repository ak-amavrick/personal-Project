package com.Hibernate_Mapping.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Question q1 = new Question();
		q1.setQuestionId(11);
		q1.setQuestion("what is java?");

		Answer a1 = new Answer();
		a1.setAnswerId(111);
		a1.setAnswer("java is a programming language");

		q1.setAnswer(a1);

		Session sess = factory.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(q1);
		tx.commit();
		sess.close();

		factory.close();

	}
}
