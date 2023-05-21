package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public fun filterProperty(initializer: CfnEventSourceMapping.FilterProperty.Builder.() -> Unit =
    {}): CfnEventSourceMapping.FilterProperty =
    CfnEventSourceMapping.FilterProperty.builder().apply(initializer).build()
