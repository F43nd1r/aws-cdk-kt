@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnOIDCProvider
import software.amazon.awscdk.services.iam.CfnOIDCProviderProps
import software.constructs.Construct

public fun Construct.cfnOIDCProvider(
  id: String,
  props: CfnOIDCProviderProps,
  initializer: CfnOIDCProvider.() -> Unit = {},
): CfnOIDCProvider = CfnOIDCProvider(this, id, props).apply(initializer)
