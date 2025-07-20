package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RequestAuthorizer
import software.amazon.awscdk.services.apigateway.RequestAuthorizerProps
import software.constructs.Construct

@Generated
public fun Construct.requestAuthorizer(
  id: String,
  props: RequestAuthorizerProps,
  initializer: @AwsCdkDsl RequestAuthorizer.() -> Unit = {},
): RequestAuthorizer = RequestAuthorizer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRequestAuthorizer(id: String, initializer: @AwsCdkDsl RequestAuthorizer.Builder.() -> Unit = {}): RequestAuthorizer = RequestAuthorizer.Builder.create(this, id).apply(initializer).build()
