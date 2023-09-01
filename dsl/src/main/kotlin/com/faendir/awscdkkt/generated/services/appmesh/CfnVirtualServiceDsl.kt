package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnVirtualService.() -> Unit = {},
): CfnVirtualService = CfnVirtualService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVirtualService(id: String, initializer: @AwsCdkDsl
    CfnVirtualService.Builder.() -> Unit = {}): CfnVirtualService =
    CfnVirtualService.Builder.create(this, id).apply(initializer).build()
