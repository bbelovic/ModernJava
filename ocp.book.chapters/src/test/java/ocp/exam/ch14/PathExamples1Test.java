package ocp.exam.ch14;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

class PathExamples1Test {
    @Test
    public void testResolve() throws IOException {
        Path path1 = Paths.get("blabol/abc");
        Path path2 = Path.of("xxx");
        String actual = path1.resolve(path2).toString();
        assertEquals("blabol/abc/xxx", actual);

        assertEquals("/root", Path.of("/home/bbelovic").resolve(Path.of("/root")).toString());
        assertEquals("/root/..", Path.of("/home/bbelovic").resolve(Path.of("/root/..")).toString());
        assertEquals("/", Path.of("/home/bbelovic").resolve(Path.of("/")).toString());

        Path path = Path.of(".").toRealPath();
        System.out.println(path);

    }

    @Test
    public void testEquality() {
        Path first = Path.of("/home/abc");
        Path second = Path.of("/home/abc");
        assertTrue(first.equals(second));
    }

    @Test
    public void testRelativize() {
        var workingDir = "/home/bbelovic/DEVEL/ModernJava/ocp.book.chapters";

        Path first = Path.of("src/main/java");
        Path second = Path.of("dst");
        // to get from first to second you need to do .. 3 times
        Path relativize = first.relativize(second);
        System.out.println(relativize);

        System.out.println(second.relativize(first));

        Path abs1 = Path.of("/home/bbelovic/Documents/BYT");
        Path abs2 = Path.of("/home/bbelovic/Downloads");
        Path result = abs1.relativize(abs2);
        assertEquals("../../Downloads", result.toString());

    }


    @Test
    public void testCopy() throws Exception {
        Path source = Path.of("/home/bbelovic/DEVEL/ModernJava/ocp.book.chapters/src/main/resources/dir1/f1.txt");
        Path dest = Path.of("/home/bbelovic/DEVEL/ModernJava/ocp.book.chapters/src/main/resources/dir2/f1");
        Files.copy(source, dest);
    }

    @Test
    public void testMove() throws Exception {
        Path source = Path.of("/home/bbelovic/DEVEL/ModernJava/ocp.book.chapters/src/main/resources/dir1/f1.txt");
        Path workingDir = Paths.get("/home/bbelovic/DEVEL/ModernJava/ocp.book.chapters");
        Path subPath = Path.of("src/main/resources", "dir3");
        Files.move(source, Path.of("/home/bbelovic/DEVEL/ModernJava/ocp.book.chapters/src/main/resources/dir3/f3"));
    }

    @Test
    public void testCreateDirectories() throws Exception {
        var workingDir = "/home/bbelovic/DEVEL/ModernJava/ocp.book.chapters";
        var subpath = "src/main/resources";
        var dirName = "dir3";
        assertThrows(FileAlreadyExistsException.class,
                () -> Files.createDirectory(Path.of(workingDir, subpath, dirName)));

        //Files.createDirectories(Path.of(workingDir, subpath, "dir4/dir5"));

        Files.move(Path.of(workingDir, subpath, "dir1"), Path.of(workingDir, subpath, "dir4/dir5/dir1"));

    }

    @Test
    public void testCommonMethods() {
        var workingDir = "/home/bbelovic/DEVEL/ModernJava/ocp.book.chapters";
        var path = Path.of(workingDir);
        assertEquals(5, path.getNameCount());
        assertTrue(path.isAbsolute());
        assertEquals(Path.of("home"), path.getName(0));
        assertEquals(Path.of("home/bbelovic/DEVEL"), path.subpath(0, 3));
        assertEquals(Path.of("ocp.book.chapters"), path.getFileName());
        assertEquals(Path.of("/"), path.getRoot());

        List<Path> actualComponents = StreamSupport.stream(path.spliterator(), false)
                .toList();

        List<Path> expectedComponents = List.of( Path.of("home"), Path.of("bbelovic"), Path.of("DEVEL"),
                Path.of("ModernJava"), Path.of("ocp.book.chapters"));
        assertEquals(expectedComponents, actualComponents);

        assertEquals(Path.of("/home/bbelovic/DEVEL/ModernJava"), path.getParent());
        assertEquals(Path.of("/home/bbelovic/DEVEL"), path.getParent().getParent());
        assertEquals(Path.of("/home/bbelovic"), path.getParent().getParent().getParent());
    }

    @Test
    public void testWalk() {
        var workingDir = "/home/bbelovic/DEVEL/ModernJava/ocp.book.chapters";
        var subpath = "src/main/resources";
        var path = Path.of(workingDir, subpath);
        var actual = countFiles(path, Files::isDirectory, 1);
        assertEquals(4, actual);
    }

    private long countFiles(Path start, Predicate<Path> predicate, int depth) {
        long result;
        try (var s = Files.walk(start, depth)) {
            result = s.filter(predicate)
//                    .peek((p) -> System.out.println(p))
                    .count();
        } catch (IOException e) {
            result = 0;
        }
        return result;
    }
}