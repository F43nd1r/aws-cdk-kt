package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMPool
import software.amazon.awscdk.services.ec2.CfnIPAMPoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMPool(
  id: String,
  props: CfnIPAMPoolProps,
  initializer: CfnIPAMPool.() -> Unit = {},
): CfnIPAMPool = CfnIPAMPool(this, id, props).apply(initializer)
