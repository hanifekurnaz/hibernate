package com.hibernatetest;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personel personel = new Personel();
		personel.setPersonelAdi("Hanife");
		personel.setPersonelSoyadi("Kurnaz");
		personel.setKayitTarihi(new Date());
		personel.setPersonelAdresi("Samsun Turkiye");
		
		Personel personel2 = new Personel();
		personel2.setPersonelAdi("Meltem");
		personel2.setPersonelSoyadi("Tahta");
		personel2.setKayitTarihi(new Date());
		personel2.setPersonelAdresi("Samsun Turkiye");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //tanimlanan oturumlari ureten fabrika sinifi
		Session session = sessionFactory.openSession(); //oturumu ac
		session.beginTransaction(); //transaction baslangic
		session.save(personel); //veritabanina kaydet
		session.save(personel2);
		session.getTransaction().commit();	//transaction bitis
		session.close(); // oturum nesnesi sonlandirma
		}
}
