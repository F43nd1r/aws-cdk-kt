package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCloudFormationProduct(
  id: String,
  props: CfnCloudFormationProductProps,
  initializer: CfnCloudFormationProduct.() -> Unit = {},
): CfnCloudFormationProduct = CfnCloudFormationProduct(this, id, props).apply(initializer)
