@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnSAMLProvider
import software.amazon.awscdk.services.iam.CfnSAMLProviderProps
import software.constructs.Construct

public fun Construct.cfnSAMLProvider(
  id: String,
  props: CfnSAMLProviderProps,
  initializer: CfnSAMLProvider.() -> Unit = {},
): CfnSAMLProvider = CfnSAMLProvider(this, id, props).apply(initializer)
