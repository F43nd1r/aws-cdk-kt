@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.fms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fms.CfnResourceSet
import software.amazon.awscdk.services.fms.CfnResourceSetProps
import software.constructs.Construct

public fun Construct.cfnResourceSet(
  id: String,
  props: CfnResourceSetProps,
  initializer: CfnResourceSet.() -> Unit = {},
): CfnResourceSet = CfnResourceSet(this, id, props).apply(initializer)
