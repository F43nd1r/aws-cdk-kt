@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps
import software.constructs.Construct

public fun Construct.userPoolIdentityProviderAmazon(
  id: String,
  props: UserPoolIdentityProviderAmazonProps,
  initializer: UserPoolIdentityProviderAmazon.() -> Unit = {},
): UserPoolIdentityProviderAmazon = UserPoolIdentityProviderAmazon(this, id,
    props).apply(initializer)
