package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.AwsIntegration

@Generated
public fun buildAwsIntegration(initializer: @AwsCdkDsl AwsIntegration.Builder.() -> Unit = {}):
    AwsIntegration = AwsIntegration.Builder.create().apply(initializer).build()
