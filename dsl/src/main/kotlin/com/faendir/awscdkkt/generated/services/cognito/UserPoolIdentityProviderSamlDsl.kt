package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolIdentityProviderSaml(
  id: String,
  props: UserPoolIdentityProviderSamlProps,
  initializer: @AwsCdkDsl UserPoolIdentityProviderSaml.() -> Unit = {},
): UserPoolIdentityProviderSaml = UserPoolIdentityProviderSaml(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUserPoolIdentityProviderSaml(id: String, initializer: @AwsCdkDsl
    UserPoolIdentityProviderSaml.Builder.() -> Unit = {}): UserPoolIdentityProviderSaml =
    UserPoolIdentityProviderSaml.Builder.create(this, id).apply(initializer).build()
