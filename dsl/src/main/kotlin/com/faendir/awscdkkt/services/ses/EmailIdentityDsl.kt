@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
