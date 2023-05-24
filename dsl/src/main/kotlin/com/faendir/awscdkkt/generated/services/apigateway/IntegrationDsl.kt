package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.IntegrationProps

@Generated
public fun integration(props: IntegrationProps): Integration = Integration(props)

@Generated
public fun buildIntegration(initializer: @AwsCdkDsl Integration.Builder.() -> Unit): Integration =
    Integration.Builder.create().apply(initializer).build()
