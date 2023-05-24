package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolIdentityProviderApple(id: String,
    props: UserPoolIdentityProviderAppleProps): UserPoolIdentityProviderApple =
    UserPoolIdentityProviderApple(this, id, props)

@Generated
public fun Construct.userPoolIdentityProviderApple(
  id: String,
  props: UserPoolIdentityProviderAppleProps,
  initializer: @AwsCdkDsl UserPoolIdentityProviderApple.() -> Unit,
): UserPoolIdentityProviderApple = UserPoolIdentityProviderApple(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUserPoolIdentityProviderApple(id: String, initializer: @AwsCdkDsl
    UserPoolIdentityProviderApple.Builder.() -> Unit): UserPoolIdentityProviderApple =
    UserPoolIdentityProviderApple.Builder.create(this, id).apply(initializer).build()
