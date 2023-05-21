package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMAllocation
import software.amazon.awscdk.services.ec2.CfnIPAMAllocationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMAllocation(
  id: String,
  props: CfnIPAMAllocationProps,
  initializer: CfnIPAMAllocation.() -> Unit = {},
): CfnIPAMAllocation = CfnIPAMAllocation(this, id, props).apply(initializer)
