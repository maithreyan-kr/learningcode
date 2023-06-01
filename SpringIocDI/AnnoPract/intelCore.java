package AnnoPract;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Qualifier("intel")
public class intelCore implements MobileProcessor 
{
	public void process()
	{
		System.out.println("World 2nd best CPU");
	}
}



