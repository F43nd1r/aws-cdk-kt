@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.EmailIdentity
import software.amazon.awscdk.services.ses.EmailIdentityProps
import software.constructs.Construct

public fun Construct.emailIdentity(
  id: String,
  props: EmailIdentityProps,
  initializer: EmailIdentity.() -> Unit = {},
): EmailIdentity = EmailIdentity(this, id, props).apply(initializer)
