package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildRetryStrategyProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.RetryStrategyProperty.Builder.() -> Unit):
    CfnJobDefinition.RetryStrategyProperty =
    CfnJobDefinition.RetryStrategyProperty.Builder().apply(initializer).build()
