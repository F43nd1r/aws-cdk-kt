package com.faendir.awscdkkt.generated.services.autoscaling.hooktargets

import javax.`annotation`.Generated
import software.amazon.awscdk.services.autoscaling.hooktargets.QueueHook
import software.amazon.awscdk.services.sqs.IQueue

@Generated
public fun queueHook(queue: IQueue): QueueHook = QueueHook(queue)
