package Kasus7_1;

public enum RuteTravel {
    SURABAYA_MALANG,
    MADURA_MALANG,
    BANYUWANGI_MALANG,
    SITUBONDO_MALANG,
    TULUNGAGUNG_MALANG;

    @Override
    public String toString() {
        return this.name().replace("_", "-");
    }
}
