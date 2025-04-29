public class Project extends Assignment 
{
    private boolean groups;
    private boolean presentation;
   public Project(String name, String dueDate, double availablePoints, double earnedPoints, boolean hasGroups, boolean hasPresentation)
   {
       super(name,dueDate,availablePoints,earnedPoints);
       this.groups = groups;
       this.presentation = presentation;
   }
   
   public boolean hasGroups()
   {
       return groups;
   }
   
   public boolean hasPresentation()
   {
       return presentation;
   }
   
   public void setGroups(boolean x)
   {
       groups = x;
   }
   
   public void setPresentation(boolean w)
   {
       presentation = w;
   }
    
}
