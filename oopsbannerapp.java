public class oopsbannerapp
{
   public static void main(String[] args) {
        String[] banner = {
            " *****     *****     *****      ***** ",
            "*     *   *     *   *     *    *     *",
            "*     *   *     *   *     *    *      ",
            "*     *   *     *   *****      *****  ",
            "*     *   *     *   *              *  ",
            "*     *   *     *   *        *     *  ",
            " *****     *****    *         *****   "
        };

        fgit or (String line : banner) {
            System.out.println(line);
        }
    }
}