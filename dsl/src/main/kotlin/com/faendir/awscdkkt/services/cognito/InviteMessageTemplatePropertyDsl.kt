package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun inviteMessageTemplateProperty(initializer: CfnUserPool.InviteMessageTemplateProperty.Builder.() -> Unit
    = {}): CfnUserPool.InviteMessageTemplateProperty =
    CfnUserPool.InviteMessageTemplateProperty.builder().apply(initializer).build()
