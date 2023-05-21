package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolIdentityProviderAmazon(
  id: String,
  props: UserPoolIdentityProviderAmazonProps,
  initializer: UserPoolIdentityProviderAmazon.() -> Unit = {},
): UserPoolIdentityProviderAmazon = UserPoolIdentityProviderAmazon(this, id,
    props).apply(initializer)
