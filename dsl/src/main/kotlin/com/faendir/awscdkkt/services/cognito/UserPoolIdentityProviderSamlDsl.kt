@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps
import software.constructs.Construct

public fun Construct.userPoolIdentityProviderSaml(
  id: String,
  props: UserPoolIdentityProviderSamlProps,
  initializer: UserPoolIdentityProviderSaml.() -> Unit = {},
): UserPoolIdentityProviderSaml = UserPoolIdentityProviderSaml(this, id, props).apply(initializer)
