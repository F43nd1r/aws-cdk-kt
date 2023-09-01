package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl UserPoolIdentityProviderAmazon.() -> Unit = {},
): UserPoolIdentityProviderAmazon = UserPoolIdentityProviderAmazon(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildUserPoolIdentityProviderAmazon(id: String, initializer: @AwsCdkDsl
    UserPoolIdentityProviderAmazon.Builder.() -> Unit = {}): UserPoolIdentityProviderAmazon =
    UserPoolIdentityProviderAmazon.Builder.create(this, id).apply(initializer).build()
