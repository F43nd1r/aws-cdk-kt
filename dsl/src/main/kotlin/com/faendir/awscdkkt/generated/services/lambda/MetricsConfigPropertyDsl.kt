package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public fun buildMetricsConfigProperty(initializer: @AwsCdkDsl
    CfnEventSourceMapping.MetricsConfigProperty.Builder.() -> Unit = {}):
    CfnEventSourceMapping.MetricsConfigProperty =
    CfnEventSourceMapping.MetricsConfigProperty.Builder().apply(initializer).build()
