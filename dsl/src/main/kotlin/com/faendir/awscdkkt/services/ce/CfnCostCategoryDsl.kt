@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ce

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnCostCategory
import software.amazon.awscdk.services.ce.CfnCostCategoryProps
import software.constructs.Construct

public fun Construct.cfnCostCategory(
  id: String,
  props: CfnCostCategoryProps,
  initializer: CfnCostCategory.() -> Unit = {},
): CfnCostCategory = CfnCostCategory(this, id, props).apply(initializer)
