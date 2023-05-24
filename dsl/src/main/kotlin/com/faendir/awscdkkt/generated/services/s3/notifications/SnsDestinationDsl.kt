package com.faendir.awscdkkt.generated.services.s3.notifications

import javax.`annotation`.Generated
import software.amazon.awscdk.services.s3.notifications.SnsDestination
import software.amazon.awscdk.services.sns.ITopic

@Generated
public fun snsDestination(topic: ITopic): SnsDestination = SnsDestination(topic)
