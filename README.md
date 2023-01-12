# Enoca-Challenge

1-) MVC bir yazılım tasarım desenidir. Model View Controller katmanlarından oluşur ve projenin parçalara ayrılarak daha iyi bir şekilde geliştirilmesine olanak kılar. Java’da model veriler için veritabanına erişildiği ve veri ile ilgili işlemlerin yapıldığı katmandır. View katmanı ise son kullanıcının gördüğü arayüz katmanıdır arayüz bu katmanda geliştirilir. Controller katmanı gelen requeste göre model içerisindeki fonksiyonları kullanarak işlem yapan katmandır.  

 

2-) Api kullanılarak yapılabilir. Java ile yazılmış platfromdan C# ile yazılmış platformun apisine request atılır ve c#  platformundan gelen response ile iletişim kurulmuş olur.  

 

3-)JavaScript kütüphanelerinden ajax kullanılarak yapılabilir. 


4-)public class Main {

	public static void main(String[] args) {
		for(String x="*" ; x.length()<11;x=x+"*" ) {
			
			if(x.length()==1)
			System.out.println(x);
			
			if(x.length()%2==0)
				System.out.println(x);
			
		}
	}

}

5-)Windows işletim sistemi kullandığım makinama putty yazılımı kurulumunu yaparım host kısmına verilen ip adresini yazıp bağladıktan sonra kullanıcı adı ve şifreyle bağlanırım.



6-)  Öncelikle Business,DataAccess,Api ve Entity katmanları oluşturdum ve lombak
kullanarak constructor,getter ve setterları oluşturdum. Entity katmanında var
olan tablolarımı postresql’deki tablolarla eşleştirdim ardından JPA repository
kullanarak bu entityler için CRUD operasyonlarına eriştim. Business katmanında
add,delete,update,list fonksiyonlarını yazdım ve injection yaparak DataAccess
türünde oluşturdugum nesneyi kullanarak crud operasyonlarına eriştim. Api
katmanında ise endpointleri isimlendirdim ve gerekli mapping işlemlerini
gerçekleştirdim. Crud operasyonlarını kullanmak için api katmanına business
katmanından oluşturduğum nesneyi enjekte ettim. Postman kullanarak
update,list,delete ve add endpointlerini test ettim.


7-)          














