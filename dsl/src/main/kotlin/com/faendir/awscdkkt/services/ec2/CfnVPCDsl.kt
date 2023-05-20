@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPC
import software.amazon.awscdk.services.ec2.CfnVPCProps
import software.constructs.Construct

public fun Construct.cfnVPC(id: String, initializer: CfnVPC.() -> Unit = {}): CfnVPC = CfnVPC(this,
    id).apply(initializer)

public fun Construct.cfnVPC(
  id: String,
  props: CfnVPCProps,
  initializer: CfnVPC.() -> Unit = {},
): CfnVPC = CfnVPC(this, id, props).apply(initializer)
