@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnUser
import software.amazon.awscdk.services.memorydb.CfnUserProps
import software.constructs.Construct

public fun Construct.cfnUser(
  id: String,
  props: CfnUserProps,
  initializer: CfnUser.() -> Unit = {},
): CfnUser = CfnUser(this, id, props).apply(initializer)
