@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
