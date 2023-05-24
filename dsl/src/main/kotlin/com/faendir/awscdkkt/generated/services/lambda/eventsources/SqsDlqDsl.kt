package com.faendir.awscdkkt.generated.services.lambda.eventsources

import javax.`annotation`.Generated
import software.amazon.awscdk.services.lambda.eventsources.SqsDlq
import software.amazon.awscdk.services.sqs.IQueue

@Generated
public fun sqsDlq(queue: IQueue): SqsDlq = SqsDlq(queue)
