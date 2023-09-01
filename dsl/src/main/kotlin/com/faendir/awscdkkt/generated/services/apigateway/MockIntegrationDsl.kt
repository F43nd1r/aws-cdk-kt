package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.MockIntegration

@Generated
public fun buildMockIntegration(initializer: @AwsCdkDsl MockIntegration.Builder.() -> Unit = {}):
    MockIntegration = MockIntegration.Builder.create().apply(initializer).build()
