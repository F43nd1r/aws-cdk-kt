@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserInvitationConfig

public fun userInvitationConfig(initializer: UserInvitationConfig.Builder.() -> Unit):
    UserInvitationConfig = UserInvitationConfig.builder().apply(initializer).build()
