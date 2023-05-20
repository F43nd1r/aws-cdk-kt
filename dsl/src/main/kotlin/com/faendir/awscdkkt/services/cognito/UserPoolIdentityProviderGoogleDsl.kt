@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
