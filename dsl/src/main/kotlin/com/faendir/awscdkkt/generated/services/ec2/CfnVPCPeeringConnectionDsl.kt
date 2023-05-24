package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCPeeringConnection(id: String, props: CfnVPCPeeringConnectionProps):
    CfnVPCPeeringConnection = CfnVPCPeeringConnection(this, id, props)

@Generated
public fun Construct.cfnVPCPeeringConnection(
  id: String,
  props: CfnVPCPeeringConnectionProps,
  initializer: @AwsCdkDsl CfnVPCPeeringConnection.() -> Unit,
): CfnVPCPeeringConnection = CfnVPCPeeringConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCPeeringConnection(id: String, initializer: @AwsCdkDsl
    CfnVPCPeeringConnection.Builder.() -> Unit): CfnVPCPeeringConnection =
    CfnVPCPeeringConnection.Builder.create(this, id).apply(initializer).build()
