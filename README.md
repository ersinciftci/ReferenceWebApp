WHY:

Current code doesn’t have good separation of layers and components are tightly coupled, so it’s hard to understand the code, hard to implement new features and it prevents different people/teams to work independently.

The project uses old or low-level technologies like JSP, Servlet, JDBC etc. so it’s harder to find open source contributors that would want to work on those technologies because some people contribute to open source projects to learn new things.

The project has shell/perl/python scripts for importing data but it’s hard to find someone who is good at all these languages plus java, so it would be better if we could migrate the import functionality to the web application itself.


HOW:

We can do it in 3 ways and each has it’s own pros/cons:

**Vertical**: Take one page or a part in a page and rearchitecture it from top to bottom.

Pros: You can see your progress after each slice is done, so you don’t have to wait for a year to see if it works.

Cons: Requires backend and frontend teams to work on the same thing at the same time, but might not be possible.

**Horizontal**: Start rearchitecturing from one layer and finish that layer before rearchitecturing the next one.

Pros: Easier than vertical because you don’t have to switch between layers during the rearchitecture.

Cons: You can end up with incompatible layers, especially between frontend-backend.

**Mixed**: First rearchitecture data and core layers horizontally, then Web API and Frontend vertically.

Pros: Data and core layers will enjoy the benefits of horizontal slicing and there won’t be incompatibilities between frontend and Web API, and the possibility of incompatibility between Web API and lower backend layers is low.

Cons: The first horizontal phase will take long, so you won’t see a full top to bottom result as early as vertical slicing.
