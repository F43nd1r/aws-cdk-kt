@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingServiceBaseProps

public
    fun queueProcessingServiceBaseProps(initializer: QueueProcessingServiceBaseProps.Builder.() -> Unit):
    QueueProcessingServiceBaseProps =
    QueueProcessingServiceBaseProps.builder().apply(initializer).build()
