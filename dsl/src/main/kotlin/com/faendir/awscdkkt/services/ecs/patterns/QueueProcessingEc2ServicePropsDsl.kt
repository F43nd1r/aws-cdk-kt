@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2ServiceProps

public
    fun queueProcessingEc2ServiceProps(initializer: QueueProcessingEc2ServiceProps.Builder.() -> Unit):
    QueueProcessingEc2ServiceProps =
    QueueProcessingEc2ServiceProps.builder().apply(initializer).build()
