@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualService
import software.amazon.awscdk.services.appmesh.VirtualServiceProps
import software.constructs.Construct

public fun Construct.virtualService(
  id: String,
  props: VirtualServiceProps,
  initializer: VirtualService.() -> Unit = {},
): VirtualService = VirtualService(this, id, props).apply(initializer)
