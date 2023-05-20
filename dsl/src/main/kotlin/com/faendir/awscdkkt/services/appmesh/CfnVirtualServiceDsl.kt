@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualService
import software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps
import software.constructs.Construct

public fun Construct.cfnVirtualService(
  id: String,
  props: CfnVirtualServiceProps,
  initializer: CfnVirtualService.() -> Unit = {},
): CfnVirtualService = CfnVirtualService(this, id, props).apply(initializer)
