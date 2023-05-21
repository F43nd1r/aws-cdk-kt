package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCPeeringConnection(
  id: String,
  props: CfnVPCPeeringConnectionProps,
  initializer: CfnVPCPeeringConnection.() -> Unit = {},
): CfnVPCPeeringConnection = CfnVPCPeeringConnection(this, id, props).apply(initializer)
