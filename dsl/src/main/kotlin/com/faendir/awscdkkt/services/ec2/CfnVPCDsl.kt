@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
