package cnv.gcm.server;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sending POST to GCM" );
        
        String apiKey = "AIzaSyD2COtA8XpoPAEITz_PYMVd0E2wbUMnuHI";
        Content content = createContent();
        
        POST2GCM.post(apiKey, content);
    }
    
    public static Content createContent(){
		
		Content c = new Content();
		
//		c.addRegId("APA91bFf0WSqIvaKwVclKhB3vehHlSaW-fq4gXqyThxzUYQukE4vGepFxPFwYNCy0vF_YgaVqHl2qrhlw6ygHy59v7OMcAcZo0yWH_uBYTHbSO-tsDyjmuPa4EXVeZ5VdJCHxQywOQZ9FGpWgmO_CemXW_hX5D7IEw");
		c.addRegId("APA91bF8vru2Xz5A263QtqJD1nBRR_3K2quJXDBUH1m00Jm7-Mu7FdV4p6BQyY9-Gs0J0uRLyhQNtLsuP24ReBm8YYMYArnR1U79C_u1XLE9Gqrt_qnNN8qnOMFYC8KdTKkfVPSBYvfH_UqJVRU9o8C7RGYBYTdOnw");
		c.createData("cong hoa xa hoi 123", "Test Message");
		
		return c;
	}
}
