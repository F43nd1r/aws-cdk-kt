package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnAccount
import software.amazon.awscdk.services.apigateway.CfnAccountProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccount(id: String, initializer: CfnAccount.() -> Unit = {}): CfnAccount =
    CfnAccount(this, id).apply(initializer)

@Generated
public fun Construct.cfnAccount(
  id: String,
  props: CfnAccountProps,
  initializer: CfnAccount.() -> Unit = {},
): CfnAccount = CfnAccount(this, id, props).apply(initializer)
