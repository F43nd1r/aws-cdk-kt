package com.faendir.awscdkkt.services.eks

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
  initializer: CfnIdentityProviderConfig.() -> Unit = {},
): CfnIdentityProviderConfig = CfnIdentityProviderConfig(this, id, props).apply(initializer)
