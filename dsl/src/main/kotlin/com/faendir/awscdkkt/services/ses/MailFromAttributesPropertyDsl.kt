@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnEmailIdentity

public
    fun mailFromAttributesProperty(initializer: CfnEmailIdentity.MailFromAttributesProperty.Builder.() -> Unit):
    CfnEmailIdentity.MailFromAttributesProperty =
    CfnEmailIdentity.MailFromAttributesProperty.builder().apply(initializer).build()
