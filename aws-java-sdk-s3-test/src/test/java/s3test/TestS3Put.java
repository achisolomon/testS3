package s3test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestS3Put {

	@Test
	public void test() {
		S3Put.write("achi-s3-poc01", "BorisTheKing", "/Users/achisolomon/Documents/BorisTheking.txt");
	}

}
