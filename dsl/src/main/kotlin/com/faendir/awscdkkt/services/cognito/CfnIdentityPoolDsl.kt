@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.amazon.awscdk.services.cognito.CfnIdentityPoolProps
import software.constructs.Construct

public fun Construct.cfnIdentityPool(
  id: String,
  props: CfnIdentityPoolProps,
  initializer: CfnIdentityPool.() -> Unit = {},
): CfnIdentityPool = CfnIdentityPool(this, id, props).apply(initializer)
