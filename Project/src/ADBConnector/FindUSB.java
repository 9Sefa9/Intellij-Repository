package ADBConnector;

import java.io.File;

public class FindUSB {

        public static boolean pluggedIn;
        public static void isADBDeviceConnected()
        {
            String[] letters = new String[]{ "A", "B", "C", "D", "E", "F", "G", "H", "I","INF08M4T1K3R"};
            File[] drives = new File[letters.length];
            boolean[] isDrive = new boolean[letters.length];

            // init the file objects and the initial drive state
            for ( int i = 0; i < letters.length; ++i )
            {
                drives[i] = new File(letters[i]+":/");

                isDrive[i] = drives[i].canRead();
            }

            System.out.println("FindDrive: waiting for devices...");

            // loop indefinitely
            while(true)
            {
                // check each drive
                for ( int i = 0; i < letters.length; ++i )
                {
                    pluggedIn = drives[i].canRead();

                    // if the state has changed output a message
                    if ( pluggedIn != isDrive[i] )
                    {
                        if (pluggedIn ) {
                            System.out.println("Drive " + letters[i] + " has been plugged in");
                            break;
                        }
                        else
                            System.out.println("Drive "+letters[i]+" has been unplugged");

                        isDrive[i] = pluggedIn;
                    }
                }

                // wait before looping
                try { Thread.sleep(100); }
                catch (InterruptedException e) { /* do nothing */ }

            }
        }
}
