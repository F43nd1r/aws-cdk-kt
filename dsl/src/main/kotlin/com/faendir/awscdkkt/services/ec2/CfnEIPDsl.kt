@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.ec2.CfnEIPProps
import software.constructs.Construct

public fun Construct.cfnEIP(id: String, initializer: CfnEIP.() -> Unit = {}): CfnEIP = CfnEIP(this,
    id).apply(initializer)

public fun Construct.cfnEIP(
  id: String,
  props: CfnEIPProps,
  initializer: CfnEIP.() -> Unit = {},
): CfnEIP = CfnEIP(this, id, props).apply(initializer)
