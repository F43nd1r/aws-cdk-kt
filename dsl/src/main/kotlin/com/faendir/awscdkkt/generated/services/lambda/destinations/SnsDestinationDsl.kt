package com.faendir.awscdkkt.generated.services.lambda.destinations

import javax.`annotation`.Generated
import software.amazon.awscdk.services.lambda.destinations.SnsDestination
import software.amazon.awscdk.services.sns.ITopic

@Generated
public fun snsDestination(topic: ITopic): SnsDestination = SnsDestination(topic)
