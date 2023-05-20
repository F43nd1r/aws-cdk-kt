@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
