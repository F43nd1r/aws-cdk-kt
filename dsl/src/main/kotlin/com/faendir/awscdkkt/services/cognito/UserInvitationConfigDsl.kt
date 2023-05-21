package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserInvitationConfig

@Generated
public fun userInvitationConfig(initializer: UserInvitationConfig.Builder.() -> Unit = {}):
    UserInvitationConfig = UserInvitationConfig.builder().apply(initializer).build()
