@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAM
import software.amazon.awscdk.services.ec2.CfnIPAMProps
import software.constructs.Construct

public fun Construct.cfnIPAM(
  id: String,
  props: CfnIPAMProps,
  initializer: CfnIPAM.() -> Unit = {},
): CfnIPAM = CfnIPAM(this, id, props).apply(initializer)

public fun Construct.cfnIPAM(id: String, initializer: CfnIPAM.() -> Unit = {}): CfnIPAM =
    CfnIPAM(this, id).apply(initializer)
