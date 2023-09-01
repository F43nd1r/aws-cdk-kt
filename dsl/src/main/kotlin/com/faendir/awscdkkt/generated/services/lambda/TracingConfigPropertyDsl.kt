package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

@Generated
public fun buildTracingConfigProperty(initializer: @AwsCdkDsl
    CfnFunction.TracingConfigProperty.Builder.() -> Unit = {}): CfnFunction.TracingConfigProperty =
    CfnFunction.TracingConfigProperty.Builder().apply(initializer).build()
