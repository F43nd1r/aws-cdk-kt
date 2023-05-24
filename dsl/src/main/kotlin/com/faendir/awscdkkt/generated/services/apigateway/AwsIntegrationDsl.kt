package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.AwsIntegration
import software.amazon.awscdk.services.apigateway.AwsIntegrationProps

@Generated
public fun awsIntegration(props: AwsIntegrationProps): AwsIntegration = AwsIntegration(props)

@Generated
public fun buildAwsIntegration(initializer: @AwsCdkDsl AwsIntegration.Builder.() -> Unit):
    AwsIntegration = AwsIntegration.Builder.create().apply(initializer).build()
