package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnIdentity

@Generated
public
    fun mailFromAttributesProperty(initializer: CfnIdentity.MailFromAttributesProperty.Builder.() -> Unit
    = {}): CfnIdentity.MailFromAttributesProperty =
    CfnIdentity.MailFromAttributesProperty.builder().apply(initializer).build()
