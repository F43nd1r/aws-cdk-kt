package com.faendir.awscdkkt.services.ce

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnCostCategory
import software.amazon.awscdk.services.ce.CfnCostCategoryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCostCategory(
  id: String,
  props: CfnCostCategoryProps,
  initializer: CfnCostCategory.() -> Unit = {},
): CfnCostCategory = CfnCostCategory(this, id, props).apply(initializer)
