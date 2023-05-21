package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnOIDCProvider
import software.amazon.awscdk.services.iam.CfnOIDCProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOIDCProvider(
  id: String,
  props: CfnOIDCProviderProps,
  initializer: CfnOIDCProvider.() -> Unit = {},
): CfnOIDCProvider = CfnOIDCProvider(this, id, props).apply(initializer)
