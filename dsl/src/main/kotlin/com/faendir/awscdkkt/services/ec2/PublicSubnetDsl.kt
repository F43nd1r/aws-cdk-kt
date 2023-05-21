package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PublicSubnet
import software.amazon.awscdk.services.ec2.PublicSubnetProps
import software.constructs.Construct

@Generated
public fun Construct.publicSubnet(
  id: String,
  props: PublicSubnetProps,
  initializer: PublicSubnet.() -> Unit = {},
): PublicSubnet = PublicSubnet(this, id, props).apply(initializer)
