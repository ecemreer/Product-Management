# Product Management - Üretim Hattı Optimizasyonu

Bu proje, üretim hattında işler ve makineler arasındaki geçiş maliyetlerini minimize etmeyi amaçlayan bir optimizasyon algoritmasını içerir. Proje, dinamik programlama (DP) kullanarak en uygun işlem sırasını ve makineler arası geçişleri belirler.

## Proje Amacı

Bu proje, bir üretim hattındaki işler ve makineler arasındaki geçiş maliyetlerini minimize etmek için bir çözüm sunar. Bir dizi iş, farklı makinelerde yapılabilir ve her işin farklı makinelerdeki işleme süresi farklıdır. Ayrıca, makineler arasında geçiş yapılması durumunda bir geçiş maliyeti bulunmaktadır. Amaç, minimum toplam süreyi hesaplamaktır.

## Kullanılan Yöntem

Bu projede **Dinamik Programlama (DP)** kullanılmıştır. DP, problemleri daha küçük parçalara bölerek çözmeyi amaçlar ve bu sayede daha verimli çözümler elde edilmesini sağlar. Buradaki çözüm, her iş için en uygun makineyi ve makineler arası geçişleri hesaplar.

## Proje Yapısı

Proje şu dosyaları içerir:

- `src/Main.java`: Ana sınıf, uygulamanın giriş noktası.
- `src/ProductionLineOptimizer.java`: Üretim hattı optimizasyonunu gerçekleştiren sınıf.
- `.gitignore`: Git tarafından izlenmemesi gereken dosyaları belirtir.
- `.idea/`: IntelliJ IDEA projesi ile ilgili dosyalar.

