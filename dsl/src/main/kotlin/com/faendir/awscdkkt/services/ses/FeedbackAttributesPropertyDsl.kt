@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnEmailIdentity

public
    fun feedbackAttributesProperty(initializer: CfnEmailIdentity.FeedbackAttributesProperty.Builder.() -> Unit):
    CfnEmailIdentity.FeedbackAttributesProperty =
    CfnEmailIdentity.FeedbackAttributesProperty.builder().apply(initializer).build()
