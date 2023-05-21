package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnKeyPair
import software.amazon.awscdk.services.ec2.CfnKeyPairProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKeyPair(
  id: String,
  props: CfnKeyPairProps,
  initializer: CfnKeyPair.() -> Unit = {},
): CfnKeyPair = CfnKeyPair(this, id, props).apply(initializer)
