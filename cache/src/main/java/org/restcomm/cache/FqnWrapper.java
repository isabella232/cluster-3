package org.restcomm.cache;

import org.jboss.cache.Fqn;

public class FqnWrapper {

    private Fqn fqn;

    public FqnWrapper(Fqn fqn) {
        this.fqn = fqn;
    }

    public Fqn getFqn() {
        return this.fqn;
    }

    public Object getLastElement() {
        return this.fqn.getLastElement();
    }

    public static FqnWrapper fromStringWrapper(String stringRepresentation) {
        return new FqnWrapper(Fqn.fromString(stringRepresentation));
    }

    public static FqnWrapper fromRelativeElementsWrapper(FqnWrapper base, Object... relativeElements) {
        return new FqnWrapper(Fqn.fromRelativeElements(base.getFqn(), relativeElements));
    }

    public static FqnWrapper fromElementsWrapper(Object... elements) {
        return new FqnWrapper(Fqn.fromElements(elements));
    }

}
