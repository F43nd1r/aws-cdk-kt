@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps
import software.constructs.Construct

public fun Construct.userPoolIdentityProviderGoogle(
  id: String,
  props: UserPoolIdentityProviderGoogleProps,
  initializer: UserPoolIdentityProviderGoogle.() -> Unit = {},
): UserPoolIdentityProviderGoogle = UserPoolIdentityProviderGoogle(this, id,
    props).apply(initializer)
