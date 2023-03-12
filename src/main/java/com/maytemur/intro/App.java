package com.maytemur.intro;

/* şimdiye kadar hibernate paketlerini jdbc connector'u veya spring paketlerini kullandık büyük
bir projede 30-40 tane paket olabilir her birininde 9-10 jar'ı olabilir bunların hepsini yönetmemiz
mümkün değil. Dahada kötüsü spring güncelleme aldığında bunu el ile eskilerini sil yenilerini al yapmamız
gerekir bu noktada karşımıza Maven çıkıyor. Maven bize şunları sağlıyor;
1- jar dosyalarını yönetebiliyoruz
2- project temp-standart proje şablonları sunuyor- klasik bir java uyg. veya web uygulaması bunlarda bize standartlar
sağlıyor. Herhangi bir şirkete gittiğinizde Maven varsa ona göre herşey standart'lar dahilinde
3- build - yani versiyon takibi sistemi sunuyor özellikle konfigürasyon yonetim araclari ile
biz burada 1 ve 2 ye bakıcaz
hibernate güncelleme aldığında veya spring yeni bir framework çıkarttığında bunu maven'e yüklüyor buna 
repository (yani github gibi) diyoruz ve bunları mavende var mı yok mu 
1- search.maven.org
2- mvnrepository.com dan arayabiliyoruz var mı yok mu diye! Buradan ilgili kodları alıp
POM dosyasının içine yapıştırıyoruz ve böylece tek tek bütün jarları el ile eklemekden vs kurtuluyoruz.
Yani Maven bize proje yönetimi sunuyor.
Burada normal proje ama Maven yonetimi altinda. src/test/java altinda junit yuklenmis kodun kod ile 
test edilmesini sagliyor ayrıca Maven Dependicies altında yuklü. Target build çıktısının ekleneceği yer.
Maven otomatik ekliyor. src klasörü sonra anlatılacak ve pom ise;
çok önemli proje ile ilgili bilgilerin olduğu yer. Burada dependencies altına ilgili paketleri ekliyoruz
Lokal repository pc'de C:\Users\maytemur\.m2\repository klasöründe yoksa önce burya yüklüyor burayı
update ediyor 
*/
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
