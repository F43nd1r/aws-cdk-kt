package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.amazon.awscdk.services.cognito.CfnIdentityPoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdentityPool(
  id: String,
  props: CfnIdentityPoolProps,
  initializer: CfnIdentityPool.() -> Unit = {},
): CfnIdentityPool = CfnIdentityPool(this, id, props).apply(initializer)
