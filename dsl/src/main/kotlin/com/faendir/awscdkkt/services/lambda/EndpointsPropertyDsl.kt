package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public fun endpointsProperty(initializer: CfnEventSourceMapping.EndpointsProperty.Builder.() -> Unit
    = {}): CfnEventSourceMapping.EndpointsProperty =
    CfnEventSourceMapping.EndpointsProperty.builder().apply(initializer).build()
