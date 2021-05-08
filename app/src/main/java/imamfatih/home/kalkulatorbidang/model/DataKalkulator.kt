package imamfatih.home.kalkulatorbidang.model

import imamfatih.home.kalkulatorbidang.R

object DataKalkulator {
    private val calcNames = arrayOf(
        "Persegi",
        "Persegi Panjang",
        "Segitiga Sama Kaki",
        "Lingkaran",
        "Jajar Genjang",
        "Belah Ketupat",
        "Kubus",
        "Balok",
        "Prisma",
        "Tabung",
        "Limas",
        "Bola"
    )

    private val calcDetails = arrayOf(
        "Persegi merupakan bangun segi empat yang sisi-sisnya sama besar. Contohnya adalah papan catur.\n\n\nSifat :\n\n" +
                "1. Memiliki 4 buah sumbu simetri dan simetri putar tingkat 4\n\n2. Dapat menempati bingkainya dengan 8 cara\n\n3. Keempat sisinya sama panjang (AB = BC = CD = AD)\n\n4. sisi-sisi yang berhadapan sejajar (AB // CD dan BC // AD)\n\n5. Tiap-tiap sudutnya sama besar, yaitu tiap sudutnya adalah 90 derajat\n\n6. Diaonal-diagonalnya sama panjang (BD = AC)\n\n7. Diagonal-diagonalnya saling berpotongan tegak lurus dan membagi dua sama panjang (AO = OC = BO = OD)",
        "Persegi Panjang merupakan bangun segi empat yang keempat sudutnya siku-siku dan sisi-sisi yang berhadapan sama panjang dan sejajar. Contohnya adalah lapangan sepak bola\n\n\nSifat :\n\n" +
                "1. Memiliki 2 buah sumbu simetri dan simetri putar tingkat 2\n\n2. dapat menempati bingkainya dengan 4 cara\n\n3. Sisi-sisi yang berhadapan sama panjang (AB = DC dan AD = BC)\n\n4. Sisi-sisi yang berhadapan sama panjang (AB // DC dan AD // BC)\n\n5. Tiap-tiap sudutnya sama besar, yaitu 90 derajat\n\n6. Diagonal-diagonalnya sama panjang (AC = BD)\n\n7. Diagonal-diagonal saling berpotongan dan membagi dua sama panjang (AO = OC = BO = OD)",
        "Segitiga sama kaki adalah bangun segitiga yang mempunyai dua sisi yang sama panjang, sedangkan sisi lainnya tidaklah harus sama panjangnya dengan sisi lainnya.\n\n\nSifat :\n\n" +
                "1. Bangun segitiga sama kaki, jika diputar sebanyak satu putaran penuh maka bisa menempati bingkainya secara tepat pada satu cara. Sehingga segitiga sama kaki tersebut memiliki simetri putar sebanyak satu.\n\n2. Memiliki dua sisi sama panjang, sehingga segitiga tersebut memiliki 2 sudut sama besar, yakni sudut yang saling berhadapan.",
        "Lingkaran itu merupakan kumpulan titik-titik pada garis bidang datar yang semuanya berjarak sama dari titik tertentu. Titik ini disebut pusat lingkaran. nah, kumpulan titik-titik tersebut jika dihubungkan membentuk suatu garis lengkung. \nTitik-titik tersebut jika disatukan akan membentuk garis lengkung tanpa ada ujung/lingkaran.",
        "jajar genjang adalah segi empat yang setiap pasang sisinya berhadapan sama panjang dan sejajar. Contohnya adalah makanan wajik.\n\n\nSifat :\n\n" +
                "1. Sisi yang berhadapan sejajar dan sama panjang (AB = DC dan AB // DC, AD = BC dan AD // BC)\n\n2. Sudut-sudut yang berhadapan sama besarnya (sudut A = sudut C dan sudut B = sudut D)\n\n3. Dua sudut yang berdekatan berjumlah 180 derajat atau saling berpelurus\n\n4. Jumlah semua sudutnya = 360 derajat\n\n5. Diagonal-diagonalnya membagi jajargenjang menjadi dua sama besar\n\n6. Kedua diagonal berpotongan di tengah-tengah (titik P) dan saling membagi dua sama panjang (AP = PC dan BP = PD)",
        "Belah ketupat adalah bangun datar dua dimensi yang dibentuk oleh empat buah rusuk yang sama panjang, dan memiliki dua pasang sudut bukan siku-siku yang masing-masing sama besar dengan sudut di hadapannya. Belah ketupat dapat dibangun dari dua buah segitiga sama kaki indentik yang simetri pada alas-alasnya. Contohnya adalah ketupat, seperti banyak kalian temui saat membeli ketoprak, atau ketupat sayur.\n\n\nSifat :\n\n" +
                "1. Keempat sisinya sama panjang dan berpasangan sejajar (AB = BC = CD = DA dan AB // DC dan BC // AD)\n\n2. Kedua diagonal berpotongan tegak lurus dan saling membagi sama panjang (AC = BD dan AO = OC, BO = OD)\n\n3. Sudut-sudut yang berhadapan sama besar dan terbagi dua sama besar oleh diagonal-diagonalnya (sudut A = sudut C, sudut B = sudut D)",
        "Kubus ialah sebuah bangun ruang yang memiliki panjang rusuk yang sama serta merupakan bangun yang dibatasi oleh enam buah sisi yang sama dan sebangun, serta merupakan bangun ruang tiga dimensi. Kubus ini memiliki 6 buah sisi, 12 buah rusuk dan 8 buah titik sudut.\n\n\nSifat :\n\n" +
                "1. Mempunyai 6 sisi berbentuk persegi yang ukurannya sama luas\n\n2. Mempunyai 12 rusuk yang ukurannya sama panjang\n3. Mempunyai 8 titik sudut\n\n4. Mempunyai 4 buah diagonal ruang\n\n5. mempunyai 12 buah bidang diagonal",
        "balok ialah bangun ruang tiga dimensi yang dibentuk dari tiga pasang persegi atau persegi panjang, dengan setidaknya memiliki satu pasang diantaranya berukuran berbeda\n\n\nSifat :\n\n" +
                "1. Mempunyai 4 sisi berbentuk persegi panjang (2 pasang persegi panjang yang ukurannya sama)\n\n2. Mempunyai 2 sisi yang bentuknya sama (1 pasang persegi panjang dengan ukurannya sama namun berbeda ukuran dengan 2 pasang persegi panjang yang lain)\n\n3. Mempunyai 12 rusuk yang ukurannya sama panjang\n\n4. Mempunyai 8 buah titik sudut",
        "Prisma dapat didefinisikan sebuah hasil dari gabungan antara bangun datar 2 dimensi baik dari bangun datar persegi panjang atau bangun datar segitiga.\n\n\nSifat :\n\n" +
                "1. Mempunyai bidang alas dan bidang atas berupa segitiga yang kongruen (2 alas tersebut juga merupakan sisi prisma segitiga)\n\n2. Mempunyai 5 sisi (2 sisi berupa alas atas dan bawah, 3 sisi lainnya merupakan sisi tegak yang semuanya berbentuk segitiga)\n\n3. Mempunyai 9 rusuk\n\n4. Mempunyai 6 titik sudut",
        "Bangun Tabung adalah sebuah bangun ruang tiga dimensi yang memiliki tutup dan alas yang berbentuk sebuah lingkaran dengan ukuran yang sama dengan di selimuti oleh persegi panjang.\n\n\nSifat :\n\n" +
                "1. Mempunyai 3 sisi (2 sisi berbentuk lingkaran dan 1 sisi berupa selimut tabung)\n\n2. Mempunyai 2 rusuk",
        "Limas adalah sebuah bangun ruang 3 dimensi yang memiliki alas yang berbentuk segi banyak dan bidang tegaknya berbentuk segitiga dan salah satu sudutnya bertemu di satu titik.\n\n\nSifat :\n\n" +
                "1. Mempunyai 5 sisi yaitu : 1 sisi berbentuk segi empat yang merupakan alas dan 4 sisi lainnya semuanya berbentuk segitiga serta merupakan sisi tegak.\n\n2. Mempunyai 8 buah rusuk\n\n3. Mempunyai 5 titik sudut yaitu : 4 sudut berada di bagian alas dan 1 sudut berada di bagian atas yang merupakan titik puncak.",
        "Bola ialah sebuah bangun ruang sisi lengkung yang dibatasi oleh suatu bidang lengkung.\n\n\nSifat :\n\n" +
                "Mempunyai alas berbentuk segienam \n\n2. mempunyai 6 sisi\n\n3. Mempunyai 10 rusuk\n\n4. Mempunyai 6 titik sudut"
    )

    private val calcImage = intArrayOf(
        R.drawable.ic_persegi,
        R.drawable.ic_persegi_panjang,
        R.drawable.ic_segitiga,
        R.drawable.ic_lingkaran,
        R.drawable.ic_jajar_genjang,
        R.drawable.ic_belah_ketupat,
        R.drawable.ic_kubus,
        R.drawable.ic_balok,
        R.drawable.ic_prisma,
        R.drawable.ic_tabung,
        R.drawable.ic_limas,
        R.drawable.ic_bola
    )
    val listData: ArrayList<Kalkulator>get(){
        val list = arrayListOf<Kalkulator>()
        for (position in calcNames.indices){
            val kalk = Kalkulator()
            kalk.name = calcNames[position]
            kalk.detail = calcDetails[position]
            kalk.photo = calcImage[position]
            list.add(kalk)
        }
        return list
    }
}