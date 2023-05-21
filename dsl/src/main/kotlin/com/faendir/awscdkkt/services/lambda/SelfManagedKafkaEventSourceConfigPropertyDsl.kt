package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public
    fun selfManagedKafkaEventSourceConfigProperty(initializer: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit
    = {}): CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty =
    CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.builder().apply(initializer).build()
