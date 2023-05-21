package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualService
import software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVirtualService(
  id: String,
  props: CfnVirtualServiceProps,
  initializer: CfnVirtualService.() -> Unit = {},
): CfnVirtualService = CfnVirtualService(this, id, props).apply(initializer)
