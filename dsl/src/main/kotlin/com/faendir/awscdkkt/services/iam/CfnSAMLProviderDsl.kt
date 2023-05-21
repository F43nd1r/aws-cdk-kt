package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnSAMLProvider
import software.amazon.awscdk.services.iam.CfnSAMLProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSAMLProvider(
  id: String,
  props: CfnSAMLProviderProps,
  initializer: CfnSAMLProvider.() -> Unit = {},
): CfnSAMLProvider = CfnSAMLProvider(this, id, props).apply(initializer)
