package com.hsingh.shortuuid;

/**
 * A short, unambiguous and URL-safe UUID
 *
 * @author Harpreet Singh
 */
public final class ShortUuid {

    private final String uuid;

    private ShortUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(o instanceof ShortUuid))
            return false;

        return ((ShortUuid) o).toString().equals(uuid);
    }
}
