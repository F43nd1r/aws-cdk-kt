package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolIdentityProviderOidc(
  id: String,
  props: UserPoolIdentityProviderOidcProps,
  initializer: @AwsCdkDsl UserPoolIdentityProviderOidc.() -> Unit = {},
): UserPoolIdentityProviderOidc = UserPoolIdentityProviderOidc(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUserPoolIdentityProviderOidc(id: String, initializer: @AwsCdkDsl UserPoolIdentityProviderOidc.Builder.() -> Unit = {}): UserPoolIdentityProviderOidc = UserPoolIdentityProviderOidc.Builder.create(this, id).apply(initializer).build()
