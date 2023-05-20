@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ProxyResource
import software.amazon.awscdk.services.apigateway.ProxyResourceProps
import software.constructs.Construct

public fun Construct.proxyResource(
  id: String,
  props: ProxyResourceProps,
  initializer: ProxyResource.() -> Unit = {},
): ProxyResource = ProxyResource(this, id, props).apply(initializer)
