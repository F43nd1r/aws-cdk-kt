package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IntegrationConfig

@Generated
public fun buildIntegrationConfig(initializer: @AwsCdkDsl IntegrationConfig.Builder.() -> Unit =
    {}): IntegrationConfig = IntegrationConfig.Builder().apply(initializer).build()
