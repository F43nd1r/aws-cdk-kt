package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.HttpIntegration
import software.amazon.awscdk.services.apigateway.HttpIntegrationProps

@Generated
public fun httpIntegration(url: String): HttpIntegration = HttpIntegration(url)

@Generated
public fun httpIntegration(url: String, props: HttpIntegrationProps): HttpIntegration =
    HttpIntegration(url, props)

@Generated
public fun buildHttpIntegration(url: String, initializer: @AwsCdkDsl
    HttpIntegration.Builder.() -> Unit): HttpIntegration =
    HttpIntegration.Builder.create(url).apply(initializer).build()
