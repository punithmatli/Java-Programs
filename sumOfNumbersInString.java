class SumNumbers{
    public static long findSum(String s){
        int start = 0, end = 0;
        long sum = 0;
        boolean toggle = false;
      for(int i = 0; i < s.length(); i++) {
          if(s.charAt(i) <= '9' && s.charAt(i) >= '0') {
              end++;
              toggle = true;
          }
          else {
              if (toggle == true) sum += Long.parseLong(s.substring(start, end));
              toggle = false;
              start = i+1;
              end = i+1;
          }
      }
      if(toggle == true) sum += Long.parseLong(s.substring(start, end));
      return sum;
    }
}
