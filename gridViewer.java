public class gridViewer
{
	public static void view(int[][] grid)
	{
		 for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                switch(grid[i][j])
                {
                    case Maze.EMPTY:
                        System.out.print("  ");
                        break;

                    case Maze.WALL:
                        System.out.print("##");
                        break;

                    case Maze.START:
                        System.out.print("^^");
                        break;

                    case Maze.END:
                        System.out.print("$$");
                        break;

                    case Maze.VISITED:
                        System.out.print("..");
                        break;

                }   defathrow new AssertionError();
-- INSERT --                                                                                                                    32,8       11%                                                                                                                              52
            }                                                                                                                   53,8       12%
            System.out.println();                                                                                               54,8       12%
        }                          
	}
}
