package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInterface
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkInterface(id: String, props: CfnNetworkInterfaceProps):
    CfnNetworkInterface = CfnNetworkInterface(this, id, props)

@Generated
public fun Construct.cfnNetworkInterface(
  id: String,
  props: CfnNetworkInterfaceProps,
  initializer: @AwsCdkDsl CfnNetworkInterface.() -> Unit,
): CfnNetworkInterface = CfnNetworkInterface(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkInterface(id: String, initializer: @AwsCdkDsl
    CfnNetworkInterface.Builder.() -> Unit): CfnNetworkInterface =
    CfnNetworkInterface.Builder.create(this, id).apply(initializer).build()
