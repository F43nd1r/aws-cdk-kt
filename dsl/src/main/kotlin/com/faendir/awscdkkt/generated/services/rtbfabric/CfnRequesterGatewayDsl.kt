package com.faendir.awscdkkt.generated.services.rtbfabric

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rtbfabric.CfnRequesterGateway
import software.amazon.awscdk.services.rtbfabric.CfnRequesterGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRequesterGateway(
  id: String,
  props: CfnRequesterGatewayProps,
  initializer: @AwsCdkDsl CfnRequesterGateway.() -> Unit = {},
): CfnRequesterGateway = CfnRequesterGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRequesterGateway(id: String, initializer: @AwsCdkDsl CfnRequesterGateway.Builder.() -> Unit = {}): CfnRequesterGateway = CfnRequesterGateway.Builder.create(this, id).apply(initializer).build()
