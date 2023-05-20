@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps

public
    fun queueProcessingServiceBaseProps(initializer: QueueProcessingServiceBaseProps.Builder.() -> Unit):
    QueueProcessingServiceBaseProps =
    QueueProcessingServiceBaseProps.builder().apply(initializer).build()
