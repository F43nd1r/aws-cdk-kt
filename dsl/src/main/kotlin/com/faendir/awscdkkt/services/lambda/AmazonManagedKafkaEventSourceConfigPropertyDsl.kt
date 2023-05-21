package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public
    fun amazonManagedKafkaEventSourceConfigProperty(initializer: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit
    = {}): CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty =
    CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.builder().apply(initializer).build()
