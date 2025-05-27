package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnResourceGateway
import software.amazon.awscdk.services.vpclattice.CfnResourceGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceGateway(
  id: String,
  props: CfnResourceGatewayProps,
  initializer: @AwsCdkDsl CfnResourceGateway.() -> Unit = {},
): CfnResourceGateway = CfnResourceGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResourceGateway(id: String, initializer: @AwsCdkDsl
    CfnResourceGateway.Builder.() -> Unit = {}): CfnResourceGateway =
    CfnResourceGateway.Builder.create(this, id).apply(initializer).build()
