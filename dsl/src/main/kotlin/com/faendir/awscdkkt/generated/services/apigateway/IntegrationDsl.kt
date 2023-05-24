package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Integration

@Generated
public fun buildIntegration(initializer: @AwsCdkDsl Integration.Builder.() -> Unit): Integration =
    Integration.Builder.create().apply(initializer).build()
