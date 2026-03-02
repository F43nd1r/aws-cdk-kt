package com.faendir.awscdkkt.generated.services.directconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directconnect.CfnPublicVirtualInterface
import software.amazon.awscdk.services.directconnect.CfnPublicVirtualInterfaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPublicVirtualInterface(
  id: String,
  props: CfnPublicVirtualInterfaceProps,
  initializer: @AwsCdkDsl CfnPublicVirtualInterface.() -> Unit = {},
): CfnPublicVirtualInterface = CfnPublicVirtualInterface(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPublicVirtualInterface(id: String, initializer: @AwsCdkDsl CfnPublicVirtualInterface.Builder.() -> Unit = {}): CfnPublicVirtualInterface = CfnPublicVirtualInterface.Builder.create(this, id).apply(initializer).build()
