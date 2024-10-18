package io.muehlbachler.bswe;

import org.springframework.stereotype.Service;

import java.util.Locale;

// FIXME: add javadoc
@Service
public class StringService {

    /**
     * Nimmt String entgegen und gibt ihn in UPPERCASE Form, also GROẞGESCHRIEBEN zurück
     * todo großes scharfes S (=ẞ) implementieren
     * https://de.wikipedia.org/wiki/Gro%C3%9Fes_%C3%9F
     * @param string
     * @return
     */
    public String toUpperCase(final String string) {
        if (  null == string ){
            return null;
        }
        return string.toUpperCase(Locale.getDefault());
    }
}
