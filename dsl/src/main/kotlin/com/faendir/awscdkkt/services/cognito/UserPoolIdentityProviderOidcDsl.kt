@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps
import software.constructs.Construct

public fun Construct.userPoolIdentityProviderOidc(
  id: String,
  props: UserPoolIdentityProviderOidcProps,
  initializer: UserPoolIdentityProviderOidc.() -> Unit = {},
): UserPoolIdentityProviderOidc = UserPoolIdentityProviderOidc(this, id, props).apply(initializer)
