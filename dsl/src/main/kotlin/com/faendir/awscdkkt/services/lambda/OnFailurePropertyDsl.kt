package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public fun onFailureProperty(initializer: CfnEventSourceMapping.OnFailureProperty.Builder.() -> Unit
    = {}): CfnEventSourceMapping.OnFailureProperty =
    CfnEventSourceMapping.OnFailureProperty.builder().apply(initializer).build()
