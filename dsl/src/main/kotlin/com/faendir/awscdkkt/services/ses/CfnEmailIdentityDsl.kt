@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import software.amazon.awscdk.services.ses.CfnEmailIdentityProps
import software.constructs.Construct

public fun Construct.cfnEmailIdentity(
  id: String,
  props: CfnEmailIdentityProps,
  initializer: CfnEmailIdentity.() -> Unit = {},
): CfnEmailIdentity = CfnEmailIdentity(this, id, props).apply(initializer)
