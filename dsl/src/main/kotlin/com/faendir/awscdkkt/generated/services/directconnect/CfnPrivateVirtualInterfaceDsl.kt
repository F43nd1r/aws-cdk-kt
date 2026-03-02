package com.faendir.awscdkkt.generated.services.directconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directconnect.CfnPrivateVirtualInterface
import software.amazon.awscdk.services.directconnect.CfnPrivateVirtualInterfaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrivateVirtualInterface(
  id: String,
  props: CfnPrivateVirtualInterfaceProps,
  initializer: @AwsCdkDsl CfnPrivateVirtualInterface.() -> Unit = {},
): CfnPrivateVirtualInterface = CfnPrivateVirtualInterface(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPrivateVirtualInterface(id: String, initializer: @AwsCdkDsl CfnPrivateVirtualInterface.Builder.() -> Unit = {}): CfnPrivateVirtualInterface = CfnPrivateVirtualInterface.Builder.create(this, id).apply(initializer).build()
