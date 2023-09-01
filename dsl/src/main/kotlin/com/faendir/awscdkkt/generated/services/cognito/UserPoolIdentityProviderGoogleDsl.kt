package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolIdentityProviderGoogle(
  id: String,
  props: UserPoolIdentityProviderGoogleProps,
  initializer: @AwsCdkDsl UserPoolIdentityProviderGoogle.() -> Unit = {},
): UserPoolIdentityProviderGoogle = UserPoolIdentityProviderGoogle(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildUserPoolIdentityProviderGoogle(id: String, initializer: @AwsCdkDsl
    UserPoolIdentityProviderGoogle.Builder.() -> Unit = {}): UserPoolIdentityProviderGoogle =
    UserPoolIdentityProviderGoogle.Builder.create(this, id).apply(initializer).build()
