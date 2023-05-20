@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps
import software.constructs.Construct

public fun Construct.cfnSizeConstraintSet(
  id: String,
  props: CfnSizeConstraintSetProps,
  initializer: CfnSizeConstraintSet.() -> Unit = {},
): CfnSizeConstraintSet = CfnSizeConstraintSet(this, id, props).apply(initializer)
