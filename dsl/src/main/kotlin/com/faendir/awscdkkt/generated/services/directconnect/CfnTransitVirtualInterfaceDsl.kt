package com.faendir.awscdkkt.generated.services.directconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directconnect.CfnTransitVirtualInterface
import software.amazon.awscdk.services.directconnect.CfnTransitVirtualInterfaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitVirtualInterface(
  id: String,
  props: CfnTransitVirtualInterfaceProps,
  initializer: @AwsCdkDsl CfnTransitVirtualInterface.() -> Unit = {},
): CfnTransitVirtualInterface = CfnTransitVirtualInterface(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitVirtualInterface(id: String, initializer: @AwsCdkDsl CfnTransitVirtualInterface.Builder.() -> Unit = {}): CfnTransitVirtualInterface = CfnTransitVirtualInterface.Builder.create(this, id).apply(initializer).build()
