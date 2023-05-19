@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnAccount
import software.amazon.awscdk.services.apigateway.CfnAccountProps
import software.constructs.Construct

public fun Construct.cfnAccount(id: String, initializer: CfnAccount.() -> Unit = {}): CfnAccount =
    CfnAccount(this, id).apply(initializer)

public fun Construct.cfnAccount(
  id: String,
  props: CfnAccountProps,
  initializer: CfnAccount.() -> Unit = {},
): CfnAccount = CfnAccount(this, id, props).apply(initializer)
