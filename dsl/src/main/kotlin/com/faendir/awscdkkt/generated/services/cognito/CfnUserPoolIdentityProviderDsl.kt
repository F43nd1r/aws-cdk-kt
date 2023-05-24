package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPoolIdentityProvider(id: String,
    props: CfnUserPoolIdentityProviderProps): CfnUserPoolIdentityProvider =
    CfnUserPoolIdentityProvider(this, id, props)

@Generated
public fun Construct.cfnUserPoolIdentityProvider(
  id: String,
  props: CfnUserPoolIdentityProviderProps,
  initializer: @AwsCdkDsl CfnUserPoolIdentityProvider.() -> Unit,
): CfnUserPoolIdentityProvider = CfnUserPoolIdentityProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPoolIdentityProvider(id: String, initializer: @AwsCdkDsl
    CfnUserPoolIdentityProvider.Builder.() -> Unit): CfnUserPoolIdentityProvider =
    CfnUserPoolIdentityProvider.Builder.create(this, id).apply(initializer).build()
