@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnSession
import software.amazon.awscdk.services.macie.CfnSessionProps
import software.constructs.Construct

public fun Construct.cfnSession(id: String, initializer: CfnSession.() -> Unit = {}): CfnSession =
    CfnSession(this, id).apply(initializer)

public fun Construct.cfnSession(
  id: String,
  props: CfnSessionProps,
  initializer: CfnSession.() -> Unit = {},
): CfnSession = CfnSession(this, id, props).apply(initializer)
