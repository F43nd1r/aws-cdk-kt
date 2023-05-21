package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import software.amazon.awscdk.services.ec2.CfnEC2FleetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEC2Fleet(
  id: String,
  props: CfnEC2FleetProps,
  initializer: CfnEC2Fleet.() -> Unit = {},
): CfnEC2Fleet = CfnEC2Fleet(this, id, props).apply(initializer)
