package com.faendir.awscdkkt.generated.services.ce

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnCostCategory.() -> Unit = {},
): CfnCostCategory = CfnCostCategory(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCostCategory(id: String, initializer: @AwsCdkDsl CfnCostCategory.Builder.() -> Unit = {}): CfnCostCategory = CfnCostCategory.Builder.create(this, id).apply(initializer).build()
