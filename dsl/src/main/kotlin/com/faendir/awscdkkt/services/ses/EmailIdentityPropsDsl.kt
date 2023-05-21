package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.EmailIdentityProps

@Generated
public fun emailIdentityProps(initializer: EmailIdentityProps.Builder.() -> Unit = {}):
    EmailIdentityProps = EmailIdentityProps.builder().apply(initializer).build()
