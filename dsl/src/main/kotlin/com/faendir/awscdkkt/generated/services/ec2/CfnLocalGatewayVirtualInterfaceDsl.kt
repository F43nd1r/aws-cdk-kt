package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLocalGatewayVirtualInterface
import software.amazon.awscdk.services.ec2.CfnLocalGatewayVirtualInterfaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocalGatewayVirtualInterface(
  id: String,
  props: CfnLocalGatewayVirtualInterfaceProps,
  initializer: @AwsCdkDsl CfnLocalGatewayVirtualInterface.() -> Unit = {},
): CfnLocalGatewayVirtualInterface = CfnLocalGatewayVirtualInterface(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocalGatewayVirtualInterface(id: String, initializer: @AwsCdkDsl CfnLocalGatewayVirtualInterface.Builder.() -> Unit = {}): CfnLocalGatewayVirtualInterface = CfnLocalGatewayVirtualInterface.Builder.create(this, id).apply(initializer).build()
