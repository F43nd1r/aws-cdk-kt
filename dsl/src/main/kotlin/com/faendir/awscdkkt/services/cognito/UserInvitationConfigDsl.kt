@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserInvitationConfig

public fun userInvitationConfig(initializer: UserInvitationConfig.Builder.() -> Unit):
    UserInvitationConfig = UserInvitationConfig.builder().apply(initializer).build()
