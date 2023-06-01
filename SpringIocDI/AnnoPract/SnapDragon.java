package AnnoPract;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SnapDragon")
public class SnapDragon implements MobileProcessor 
{
	public void process()
	{
		System.out.println("World best CPU");
	}
}
