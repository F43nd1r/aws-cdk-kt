@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnAuthorizer
import software.amazon.awscdk.services.apigateway.CfnAuthorizerProps
import software.constructs.Construct

public fun Construct.cfnAuthorizer(
  id: String,
  props: CfnAuthorizerProps,
  initializer: CfnAuthorizer.() -> Unit = {},
): CfnAuthorizer = CfnAuthorizer(this, id, props).apply(initializer)
