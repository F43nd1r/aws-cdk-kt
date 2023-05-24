package com.faendir.awscdkkt.generated.services.s3.notifications

import javax.`annotation`.Generated
import software.amazon.awscdk.services.s3.notifications.SqsDestination
import software.amazon.awscdk.services.sqs.IQueue

@Generated
public fun sqsDestination(queue: IQueue): SqsDestination = SqsDestination(queue)
