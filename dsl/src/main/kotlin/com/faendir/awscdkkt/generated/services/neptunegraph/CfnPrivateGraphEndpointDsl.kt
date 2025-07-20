package com.faendir.awscdkkt.generated.services.neptunegraph

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpoint
import software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrivateGraphEndpoint(
  id: String,
  props: CfnPrivateGraphEndpointProps,
  initializer: @AwsCdkDsl CfnPrivateGraphEndpoint.() -> Unit = {},
): CfnPrivateGraphEndpoint = CfnPrivateGraphEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPrivateGraphEndpoint(id: String, initializer: @AwsCdkDsl CfnPrivateGraphEndpoint.Builder.() -> Unit = {}): CfnPrivateGraphEndpoint = CfnPrivateGraphEndpoint.Builder.create(this, id).apply(initializer).build()
