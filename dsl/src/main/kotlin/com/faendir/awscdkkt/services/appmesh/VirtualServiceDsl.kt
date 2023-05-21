package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualService
import software.amazon.awscdk.services.appmesh.VirtualServiceProps
import software.constructs.Construct

@Generated
public fun Construct.virtualService(
  id: String,
  props: VirtualServiceProps,
  initializer: VirtualService.() -> Unit = {},
): VirtualService = VirtualService(this, id, props).apply(initializer)
