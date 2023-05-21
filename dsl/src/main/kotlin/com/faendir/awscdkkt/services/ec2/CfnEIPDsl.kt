package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.ec2.CfnEIPProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEIP(id: String, initializer: CfnEIP.() -> Unit = {}): CfnEIP = CfnEIP(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnEIP(
  id: String,
  props: CfnEIPProps,
  initializer: CfnEIP.() -> Unit = {},
): CfnEIP = CfnEIP(this, id, props).apply(initializer)
