package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfig
import software.amazon.awscdk.services.eks.CfnIdentityProviderConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdentityProviderConfig(
  id: String,
  props: CfnIdentityProviderConfigProps,
  initializer: @AwsCdkDsl CfnIdentityProviderConfig.() -> Unit = {},
): CfnIdentityProviderConfig = CfnIdentityProviderConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdentityProviderConfig(id: String, initializer: @AwsCdkDsl
    CfnIdentityProviderConfig.Builder.() -> Unit = {}): CfnIdentityProviderConfig =
    CfnIdentityProviderConfig.Builder.create(this, id).apply(initializer).build()
