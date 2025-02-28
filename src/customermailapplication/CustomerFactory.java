package customermailapplication;

// public class CustomerFactory {
//     public static Customer createCustomer(String type) {
//         switch (type) {
//             case "Regular":
//                 return new RegularCustomer();
//             case "Mountain":
//                 return new MountainCustomer();
//             case "Delinquent":
//                 return new DelinquentCustomer();
//         }
//         return null;
//     }
// }

public class CustomerFactory {
    public static Customer createCustomer(String type) {
        if (type.equals("Mountain")) {
            return new MountainCustomer();
        }
        else if (type.equals("Delinquent")){
            return new DelinquentCustomer();
        }
        else if (type.equals("Regular")){
            return new RegularCustomer();
        }
        return null;
    }
   
}
