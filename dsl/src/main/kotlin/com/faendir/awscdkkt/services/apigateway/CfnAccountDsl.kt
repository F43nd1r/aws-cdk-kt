@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnAccount
import software.amazon.awscdk.services.apigateway.CfnAccountProps
import software.constructs.Construct

public fun Construct.cfnAccount(
  id: String,
  props: CfnAccountProps,
  initializer: CfnAccount.() -> Unit = {},
): CfnAccount = CfnAccount(this, id, props).apply(initializer)

public fun Construct.cfnAccount(id: String, initializer: CfnAccount.() -> Unit = {}): CfnAccount =
    CfnAccount(this, id).apply(initializer)
