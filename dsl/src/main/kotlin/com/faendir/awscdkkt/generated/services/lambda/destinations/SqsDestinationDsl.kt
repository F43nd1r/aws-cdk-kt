package com.faendir.awscdkkt.generated.services.lambda.destinations

import javax.`annotation`.Generated
import software.amazon.awscdk.services.lambda.destinations.SqsDestination
import software.amazon.awscdk.services.sqs.IQueue

@Generated
public fun sqsDestination(queue: IQueue): SqsDestination = SqsDestination(queue)
