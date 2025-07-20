package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.EmailIdentity
import software.amazon.awscdk.services.ses.EmailIdentityProps
import software.constructs.Construct

@Generated
public fun Construct.emailIdentity(
  id: String,
  props: EmailIdentityProps,
  initializer: @AwsCdkDsl EmailIdentity.() -> Unit = {},
): EmailIdentity = EmailIdentity(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEmailIdentity(id: String, initializer: @AwsCdkDsl EmailIdentity.Builder.() -> Unit = {}): EmailIdentity = EmailIdentity.Builder.create(this, id).apply(initializer).build()
