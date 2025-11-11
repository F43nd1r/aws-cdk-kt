package com.faendir.awscdkkt.generated.services.rtbfabric

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rtbfabric.CfnResponderGateway
import software.amazon.awscdk.services.rtbfabric.CfnResponderGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResponderGateway(
  id: String,
  props: CfnResponderGatewayProps,
  initializer: @AwsCdkDsl CfnResponderGateway.() -> Unit = {},
): CfnResponderGateway = CfnResponderGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResponderGateway(id: String, initializer: @AwsCdkDsl CfnResponderGateway.Builder.() -> Unit = {}): CfnResponderGateway = CfnResponderGateway.Builder.create(this, id).apply(initializer).build()
