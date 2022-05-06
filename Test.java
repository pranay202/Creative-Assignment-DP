class Test
{
  public static void main(String args[])
  {      
    System.out.println("------------Preparing Cheese Maggie------------");
     Maggie cm = new CheeseMaggie();
     cm.prepareMaggie();
     System.out.println("");
     System.out.println("-------------Preparing Chicken Maggie-------------");
     Maggie ckm = new ChickenMaggie();
     ckm.prepareMaggie();
  }
}
