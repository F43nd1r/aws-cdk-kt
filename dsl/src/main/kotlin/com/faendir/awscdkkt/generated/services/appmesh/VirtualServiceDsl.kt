package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl VirtualService.() -> Unit = {},
): VirtualService = VirtualService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVirtualService(id: String, initializer: @AwsCdkDsl VirtualService.Builder.() -> Unit = {}): VirtualService = VirtualService.Builder.create(this, id).apply(initializer).build()
