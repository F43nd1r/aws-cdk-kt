@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateServiceProps

public
    fun queueProcessingFargateServiceProps(initializer: QueueProcessingFargateServiceProps.Builder.() -> Unit):
    QueueProcessingFargateServiceProps =
    QueueProcessingFargateServiceProps.builder().apply(initializer).build()
