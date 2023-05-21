package com.faendir.awscdkkt.services.macie

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnSession
import software.amazon.awscdk.services.macie.CfnSessionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSession(id: String, initializer: CfnSession.() -> Unit = {}): CfnSession =
    CfnSession(this, id).apply(initializer)

@Generated
public fun Construct.cfnSession(
  id: String,
  props: CfnSessionProps,
  initializer: CfnSession.() -> Unit = {},
): CfnSession = CfnSession(this, id, props).apply(initializer)
