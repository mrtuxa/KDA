package space.mrtuxa.kda.api.audio;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.EnumSet;

/**
 * Flags representing the speaking modes used by discord users.
 */
public enum SpeakingMode
{
    VOICE(1), SOUNDSHARE(2), PRIORITY(4);

    private final int raw;

    SpeakingMode(int raw)
    {
        this.raw = raw;
    }

    /**
     * The raw bitmask for this mode
     *
     * @return bitmask
     */
    public int getRaw()
    {
        return raw;
    }

    /**
     * Parses the active modes represented by the provided bitmask
     *
     * @param  mask
     *         The bitmask containing the active speaking modes
     *
     * @return {@link EnumSet EnumSet} containing the speaking modes
     */
    @Nonnull
    public static EnumSet<SpeakingMode> getModes(int mask)
    {
        final EnumSet<SpeakingMode> modes = EnumSet.noneOf(SpeakingMode.class);
        if (mask == 0)
            return modes;
        final SpeakingMode[] values = SpeakingMode.values();
        for (SpeakingMode mode : values)
        {
            if ((mode.raw & mask) == mode.raw)
                modes.add(mode);
        }
        return modes;
    }

    /**
     * Converts the given speaking modes into raw its bitmask.
     * This is only useful for sending speaking updates.
     *
     * @param  modes
     *         The modes
     *
     * @return The bitmask for the provided speaking modes
     */
    public static int getRaw(@Nullable SpeakingMode... modes)
    {
        if (modes == null || modes.length == 0)
            return 0;
        int mask = 0;
        for (SpeakingMode m : modes)
            mask |= m.raw;
        return mask;
    }

    /**
     * Converts the given speaking modes into raw its bitmask.
     * This is only useful for sending speaking updates.
     *
     * @param  modes
     *         The modes
     *
     * @return The bitmask for the provided speaking modes
     */
    public static int getRaw(@Nullable Collection<SpeakingMode> modes)
    {
        if (modes == null)
            return 0;
        int raw = 0;
        for (SpeakingMode mode : modes)
            raw |= mode.getRaw();
        return raw;
    }
}
