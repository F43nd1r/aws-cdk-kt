@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps
import software.constructs.Construct

public fun Construct.cfnVPCPeeringConnection(
  id: String,
  props: CfnVPCPeeringConnectionProps,
  initializer: CfnVPCPeeringConnection.() -> Unit = {},
): CfnVPCPeeringConnection = CfnVPCPeeringConnection(this, id, props).apply(initializer)
