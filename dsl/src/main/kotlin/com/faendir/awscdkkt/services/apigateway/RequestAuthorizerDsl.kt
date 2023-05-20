@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
