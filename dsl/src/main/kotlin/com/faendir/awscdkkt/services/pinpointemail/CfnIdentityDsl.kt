@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import software.amazon.awscdk.services.pinpointemail.CfnIdentityProps
import software.constructs.Construct

public fun Construct.cfnIdentity(
  id: String,
  props: CfnIdentityProps,
  initializer: CfnIdentity.() -> Unit = {},
): CfnIdentity = CfnIdentity(this, id, props).apply(initializer)
