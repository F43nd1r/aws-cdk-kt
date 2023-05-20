@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps
import software.constructs.Construct

public fun Construct.userPoolIdentityProviderApple(
  id: String,
  props: UserPoolIdentityProviderAppleProps,
  initializer: UserPoolIdentityProviderApple.() -> Unit = {},
): UserPoolIdentityProviderApple = UserPoolIdentityProviderApple(this, id, props).apply(initializer)
