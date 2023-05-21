package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import software.amazon.awscdk.services.pinpointemail.CfnIdentityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdentity(
  id: String,
  props: CfnIdentityProps,
  initializer: CfnIdentity.() -> Unit = {},
): CfnIdentity = CfnIdentity(this, id, props).apply(initializer)
