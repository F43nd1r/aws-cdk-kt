@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.organizations

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.organizations.CfnAccount
import software.amazon.awscdk.services.organizations.CfnAccountProps
import software.constructs.Construct

public fun Construct.cfnAccount(
  id: String,
  props: CfnAccountProps,
  initializer: CfnAccount.() -> Unit = {},
): CfnAccount = CfnAccount(this, id, props).apply(initializer)
