@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2ServiceProps

public
    fun queueProcessingEc2ServiceProps(initializer: QueueProcessingEc2ServiceProps.Builder.() -> Unit):
    QueueProcessingEc2ServiceProps =
    QueueProcessingEc2ServiceProps.builder().apply(initializer).build()
