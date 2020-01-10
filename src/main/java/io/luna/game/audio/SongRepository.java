package io.luna.game.audio;

import io.luna.game.model.def.DefinitionRepository;

/**
 * Holds a static collection of {@link Song} instances to be queried.
 */
public class SongRepository {

    private static SongRepository singleton;

    private DefinitionRepository<Song> songs;

    private SongRepository() {
        songs = new DefinitionRepository.ArrayDefinitionRepository(600);
    }

    /**
     * Returns the first occurrence of a sound with the specified regionId.
     *
     * @param regionId The region id to search for.
     * @return The first sound with the specified regionId, if any.
     */
    public Song findSoundWithRegionId(int regionId) {
        if (songs == null) {
            throw new SoundNotFoundException("Song definitions did not load properly. Did you load the music files?");
        }

        // search through the tracks
        var foundTrack = songs.lookup(track ->
                // in each track, search for the region id
                track.regions.contains(regionId));
        // return first occurrence
        return foundTrack.orElse(null);
    }

    public DefinitionRepository<Song> all() {
        return songs;
    }

    public static SongRepository get() {
        if (singleton == null) {
            singleton = new SongRepository();
        }
        return singleton;
    }
}
