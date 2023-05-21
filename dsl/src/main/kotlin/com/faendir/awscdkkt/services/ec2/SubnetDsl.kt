package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Subnet
import software.amazon.awscdk.services.ec2.SubnetProps
import software.constructs.Construct

@Generated
public fun Construct.subnet(
  id: String,
  props: SubnetProps,
  initializer: Subnet.() -> Unit = {},
): Subnet = Subnet(this, id, props).apply(initializer)
