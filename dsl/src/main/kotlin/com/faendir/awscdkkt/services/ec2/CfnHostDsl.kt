package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnHost
import software.amazon.awscdk.services.ec2.CfnHostProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHost(
  id: String,
  props: CfnHostProps,
  initializer: CfnHost.() -> Unit = {},
): CfnHost = CfnHost(this, id, props).apply(initializer)
