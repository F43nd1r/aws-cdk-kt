@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
