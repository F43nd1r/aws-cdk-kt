package com.faendir.awscdkkt.generated.services.cloudwatch.actions

import javax.`annotation`.Generated
import software.amazon.awscdk.services.cloudwatch.actions.SnsAction
import software.amazon.awscdk.services.sns.ITopic

@Generated
public fun snsAction(topic: ITopic): SnsAction = SnsAction(topic)
