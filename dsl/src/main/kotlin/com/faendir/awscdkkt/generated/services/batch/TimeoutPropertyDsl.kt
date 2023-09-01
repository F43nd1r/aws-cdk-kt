package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildTimeoutProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.TimeoutProperty.Builder.() -> Unit = {}): CfnJobDefinition.TimeoutProperty =
    CfnJobDefinition.TimeoutProperty.Builder().apply(initializer).build()
