@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53recoveryreadiness

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps
import software.constructs.Construct

public fun Construct.cfnResourceSet(
  id: String,
  props: CfnResourceSetProps,
  initializer: CfnResourceSet.() -> Unit = {},
): CfnResourceSet = CfnResourceSet(this, id, props).apply(initializer)
