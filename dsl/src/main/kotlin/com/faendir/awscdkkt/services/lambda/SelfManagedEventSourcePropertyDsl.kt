package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public
    fun selfManagedEventSourceProperty(initializer: CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder.() -> Unit
    = {}): CfnEventSourceMapping.SelfManagedEventSourceProperty =
    CfnEventSourceMapping.SelfManagedEventSourceProperty.builder().apply(initializer).build()
