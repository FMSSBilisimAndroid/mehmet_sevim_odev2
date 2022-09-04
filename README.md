# mehmet_sevim_odev2
<h2>Kullandığım emülatör düzgün yüklemediği için kullanılan yazı fontları farklı görünüyor gerçek cihazlarda olması gerektiği gibi görünüyor</h2>
https://user-images.githubusercontent.com/56894728/188320649-758ce972-c7e0-445b-a5c4-0cbfefecabae.mp4

![Screenshot_20220904_180418](https://user-images.githubusercontent.com/56894728/188320233-a31c064e-3427-439d-ae43-4ed66ca32d27.png)

![Screenshot_20220904_180430](https://user-images.githubusercontent.com/56894728/188320235-31a7c8d3-4b3c-41e0-a84e-ae4919cf37ff.png)

![Screenshot_20220904_180358](https://user-images.githubusercontent.com/56894728/188320236-b4e7981a-132b-424a-b8d3-b4bee0fcf2ab.png)



<h2>Lazy/h2>
Lazy Loading, sayfada yer alan bir ögenin ihtiyaç duyulmadığı takdirde çağrılmaması prensibi ile çalışır yani bir nesne örneğinin gerçekten ihtiyaç duyulacağı ana kadar alınmaması ve bekletilmesi amacıyla kullanılır. Bu yöntemde veriler sorguya bağlı olarak çekilir ve veri setinin içindeki tüm dataları yüklemek yerine kullanılacağı an tekrar sorgu atar ve veriyi çeker. Örnek Örneğin, aşağıda verilen sorguyu çalıştırdığımızda, UserDetails tablosu Kullanıcı tablosu ile birlikte yüklenmeyecektir.

<h2>Eager/h2>

Lazy Loading’in tam tersi yönde çalışır. Kullanacağımız nesneleri, nesnenin ihtiyaç anından çok önce yaratır ve bekletir. Eager loading Linq sorgusu çalıştırıldığında verilerin tamamını yükler ve hafızaya alır. Örnek Örneğin, bir Kullanıcı tablonuz ve bir KullanıcıDetaylar tablonuz (Kullanıcı tablosuyla ilişkili varlık), o zaman aşağıda verilen kodu yazacaksınız. Burada, kullanıcıyı kullanıcı detayları ile birlikte kullanıcı kimliğine eşit bir ID ile yüklüyoruz.
