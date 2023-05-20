@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.CfnAccount
import software.amazon.awscdk.services.certificatemanager.CfnAccountProps
import software.constructs.Construct

public fun Construct.cfnAccount(
  id: String,
  props: CfnAccountProps,
  initializer: CfnAccount.() -> Unit = {},
): CfnAccount = CfnAccount(this, id, props).apply(initializer)
