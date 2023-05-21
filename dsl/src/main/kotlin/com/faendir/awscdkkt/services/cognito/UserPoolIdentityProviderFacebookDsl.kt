package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolIdentityProviderFacebook(
  id: String,
  props: UserPoolIdentityProviderFacebookProps,
  initializer: UserPoolIdentityProviderFacebook.() -> Unit = {},
): UserPoolIdentityProviderFacebook = UserPoolIdentityProviderFacebook(this, id,
    props).apply(initializer)
