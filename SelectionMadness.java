public class SelectionMadness {
  public SelectionMadness() { }

  public String fortune() {
    int randomNumber = (int) (Math.random() * 5) + 1;
    if(randomNumber == 1){
        return "You'll have a good day";
    }
    else if(randomNumber == 2){
        return "Today looks bright";
    }
    else if(randomNumber == 3){
        return "Today will be better than yesterday";
    }
    else if(randomNumber == 4){
        return "May your day be filled with joy";
    }
    else {
        return "Today will be the best day of the year";
    }
  }

  public int largest(int num1, int num2, int num3) {
    int largestNumber = num1;
    if(largestNumber < num2){
        largestNumber = num2;
    }
    if(largestNumber < num3){
        largestNumber = num3;
    }
    return largestNumber;
  }

}
