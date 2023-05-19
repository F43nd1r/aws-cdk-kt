@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

public
    fun selfManagedKafkaEventSourceConfigProperty(initializer: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
    CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty =
    CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.builder().apply(initializer).build()
