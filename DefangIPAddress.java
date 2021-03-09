public class DefangIPAddress {

        public static void main(String args[]){
            System.out.println(defangIPaddr("255.100.50.0"));
        }

        public static String defangIPaddr(String address) {

            StringBuilder response = new StringBuilder();

            for(int idx=0; idx<address.length(); idx++){

                if (address.charAt(idx) == '.'){
                    response.append("[.]");
                }
                else{
                    response.append(address.charAt(idx));
                }
            }

            return response.toString();
        }

}
