package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolIdentityProviderApple(
  id: String,
  props: UserPoolIdentityProviderAppleProps,
  initializer: UserPoolIdentityProviderApple.() -> Unit = {},
): UserPoolIdentityProviderApple = UserPoolIdentityProviderApple(this, id, props).apply(initializer)
