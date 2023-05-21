package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMPoolCidr(
  id: String,
  props: CfnIPAMPoolCidrProps,
  initializer: CfnIPAMPoolCidr.() -> Unit = {},
): CfnIPAMPoolCidr = CfnIPAMPoolCidr(this, id, props).apply(initializer)
