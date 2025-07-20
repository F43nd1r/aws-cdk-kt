package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.HttpIntegration
import software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps
import software.constructs.Construct

@Generated
public fun Construct.httpIntegration(
  id: String,
  props: HttpIntegrationProps,
  initializer: @AwsCdkDsl HttpIntegration.() -> Unit = {},
): HttpIntegration = HttpIntegration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHttpIntegration(id: String, initializer: @AwsCdkDsl HttpIntegration.Builder.() -> Unit = {}): HttpIntegration = HttpIntegration.Builder.create(this, id).apply(initializer).build()
