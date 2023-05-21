package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun verificationMessageTemplateProperty(initializer: CfnUserPool.VerificationMessageTemplateProperty.Builder.() -> Unit
    = {}): CfnUserPool.VerificationMessageTemplateProperty =
    CfnUserPool.VerificationMessageTemplateProperty.builder().apply(initializer).build()
