package io.luna.net.msg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameMessageRepositoryFileParserTest {

    @Test
    void testFileParser() {
        GameMessageRepository repository = new GameMessageRepository();
        GameMessageRepositoryFileParser fileParser = new GameMessageRepositoryFileParser(repository);
        fileParser.run();

        // check if repository was populated
        var collection = repository.iterator();
        assertTrue(collection.hasNext(), "Cannot locate and/or parse game message repository files.");
    }

}