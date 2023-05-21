package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps

@Generated
public fun cfnEventSourceMappingProps(initializer: CfnEventSourceMappingProps.Builder.() -> Unit =
    {}): CfnEventSourceMappingProps =
    CfnEventSourceMappingProps.builder().apply(initializer).build()
