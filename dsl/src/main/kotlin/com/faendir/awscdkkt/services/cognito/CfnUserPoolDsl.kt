@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool
import software.amazon.awscdk.services.cognito.CfnUserPoolProps
import software.constructs.Construct

public fun Construct.cfnUserPool(
  id: String,
  props: CfnUserPoolProps,
  initializer: CfnUserPool.() -> Unit = {},
): CfnUserPool = CfnUserPool(this, id, props).apply(initializer)

public fun Construct.cfnUserPool(id: String, initializer: CfnUserPool.() -> Unit = {}): CfnUserPool
    = CfnUserPool(this, id).apply(initializer)
