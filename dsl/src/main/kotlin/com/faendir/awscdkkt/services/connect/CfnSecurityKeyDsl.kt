package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnSecurityKey
import software.amazon.awscdk.services.connect.CfnSecurityKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityKey(
  id: String,
  props: CfnSecurityKeyProps,
  initializer: CfnSecurityKey.() -> Unit = {},
): CfnSecurityKey = CfnSecurityKey(this, id, props).apply(initializer)
