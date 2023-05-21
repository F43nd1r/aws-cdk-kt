package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBProxy
import software.amazon.awscdk.services.rds.CfnDBProxyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBProxy(
  id: String,
  props: CfnDBProxyProps,
  initializer: CfnDBProxy.() -> Unit = {},
): CfnDBProxy = CfnDBProxy(this, id, props).apply(initializer)
