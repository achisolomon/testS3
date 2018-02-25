package s3test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TestS3Get {

	@Test
	public void test() throws IOException {
		//S3Get.read("achi-test", "README");
		//S3Get.read("achi-s3-poc01", "BorisTheKing");
		S3Get.read("achi-s3-poc-replica", "S3objectkey.txt");
	}

}
