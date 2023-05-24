package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolIdentityProviderFacebook(id: String,
    props: UserPoolIdentityProviderFacebookProps): UserPoolIdentityProviderFacebook =
    UserPoolIdentityProviderFacebook(this, id, props)

@Generated
public fun Construct.userPoolIdentityProviderFacebook(
  id: String,
  props: UserPoolIdentityProviderFacebookProps,
  initializer: @AwsCdkDsl UserPoolIdentityProviderFacebook.() -> Unit,
): UserPoolIdentityProviderFacebook = UserPoolIdentityProviderFacebook(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildUserPoolIdentityProviderFacebook(id: String, initializer: @AwsCdkDsl
    UserPoolIdentityProviderFacebook.Builder.() -> Unit): UserPoolIdentityProviderFacebook =
    UserPoolIdentityProviderFacebook.Builder.create(this, id).apply(initializer).build()
