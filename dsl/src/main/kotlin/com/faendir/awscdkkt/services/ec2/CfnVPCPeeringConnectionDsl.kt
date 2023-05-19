@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
