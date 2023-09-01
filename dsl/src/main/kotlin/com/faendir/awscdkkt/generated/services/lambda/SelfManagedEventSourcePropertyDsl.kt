package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public fun buildSelfManagedEventSourceProperty(initializer: @AwsCdkDsl
    CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder.() -> Unit = {}):
    CfnEventSourceMapping.SelfManagedEventSourceProperty =
    CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder().apply(initializer).build()
