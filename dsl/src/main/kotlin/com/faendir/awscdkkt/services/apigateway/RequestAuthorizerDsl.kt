@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RequestAuthorizer
import software.amazon.awscdk.services.apigateway.RequestAuthorizerProps
import software.constructs.Construct

public fun Construct.requestAuthorizer(
  id: String,
  props: RequestAuthorizerProps,
  initializer: RequestAuthorizer.() -> Unit = {},
): RequestAuthorizer = RequestAuthorizer(this, id, props).apply(initializer)
