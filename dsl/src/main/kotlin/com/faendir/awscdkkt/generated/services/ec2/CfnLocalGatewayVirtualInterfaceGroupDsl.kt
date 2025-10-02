package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLocalGatewayVirtualInterfaceGroup
import software.amazon.awscdk.services.ec2.CfnLocalGatewayVirtualInterfaceGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLocalGatewayVirtualInterfaceGroup(
  id: String,
  props: CfnLocalGatewayVirtualInterfaceGroupProps,
  initializer: @AwsCdkDsl CfnLocalGatewayVirtualInterfaceGroup.() -> Unit = {},
): CfnLocalGatewayVirtualInterfaceGroup = CfnLocalGatewayVirtualInterfaceGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocalGatewayVirtualInterfaceGroup(id: String, initializer: @AwsCdkDsl CfnLocalGatewayVirtualInterfaceGroup.Builder.() -> Unit = {}): CfnLocalGatewayVirtualInterfaceGroup = CfnLocalGatewayVirtualInterfaceGroup.Builder.create(this, id).apply(initializer).build()
