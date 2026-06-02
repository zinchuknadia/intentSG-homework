### Violations in the original code

1. **Single Responsibility Principle** 

    The class has too many jobs at once: it generates 
    reports, saves files, sends emails, and validates data. 
    Each of these is a separate concern. If the email logic changes, 
    you have to touch the same class that handles report formatting — 
    which is not where that change belongs.


2. **Open/Closed Principle**

    To add a new report format like XML, you have to go inside 
    generateReport and add another else if branch. The class is 
    not closed for modification. It should be possible to extend 
    behavior by adding new code, not by editing existing code.


3. **Dependency Inversion Principle**

    The class takes a String reportType and decides internally what 
    to do with it. This means it depends on concrete details rather than 
    abstractions. The high-level coordinator should not know about PDF or 
    CSV specifics — it should depend on an interface, and the concrete 
    implementation should be passed in from outside.