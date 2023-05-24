package com.faendir.awscdkkt.generated.services.lambda.eventsources

import javax.`annotation`.Generated
import software.amazon.awscdk.services.lambda.eventsources.SnsDlq
import software.amazon.awscdk.services.sns.ITopic

@Generated
public fun snsDlq(topic: ITopic): SnsDlq = SnsDlq(topic)
