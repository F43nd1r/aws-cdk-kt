@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnUser
import software.amazon.awscdk.services.elasticache.CfnUserProps
import software.constructs.Construct

public fun Construct.cfnUser(
  id: String,
  props: CfnUserProps,
  initializer: CfnUser.() -> Unit = {},
): CfnUser = CfnUser(this, id, props).apply(initializer)
