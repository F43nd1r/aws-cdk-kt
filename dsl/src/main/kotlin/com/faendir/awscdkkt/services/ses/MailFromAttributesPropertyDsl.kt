package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnEmailIdentity

@Generated
public
    fun mailFromAttributesProperty(initializer: CfnEmailIdentity.MailFromAttributesProperty.Builder.() -> Unit
    = {}): CfnEmailIdentity.MailFromAttributesProperty =
    CfnEmailIdentity.MailFromAttributesProperty.builder().apply(initializer).build()
