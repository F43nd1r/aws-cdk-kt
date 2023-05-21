package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public
    fun documentDBEventSourceConfigProperty(initializer: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder.() -> Unit
    = {}): CfnEventSourceMapping.DocumentDBEventSourceConfigProperty =
    CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.builder().apply(initializer).build()
