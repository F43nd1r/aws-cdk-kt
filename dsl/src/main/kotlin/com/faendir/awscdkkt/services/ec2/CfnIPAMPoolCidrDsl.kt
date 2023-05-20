@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidr
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps
import software.constructs.Construct

public fun Construct.cfnIPAMPoolCidr(
  id: String,
  props: CfnIPAMPoolCidrProps,
  initializer: CfnIPAMPoolCidr.() -> Unit = {},
): CfnIPAMPoolCidr = CfnIPAMPoolCidr(this, id, props).apply(initializer)
