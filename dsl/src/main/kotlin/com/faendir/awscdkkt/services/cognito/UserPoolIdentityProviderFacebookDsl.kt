@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps
import software.constructs.Construct

public fun Construct.userPoolIdentityProviderFacebook(
  id: String,
  props: UserPoolIdentityProviderFacebookProps,
  initializer: UserPoolIdentityProviderFacebook.() -> Unit = {},
): UserPoolIdentityProviderFacebook = UserPoolIdentityProviderFacebook(this, id,
    props).apply(initializer)
