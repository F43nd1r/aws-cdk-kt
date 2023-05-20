@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps
import software.constructs.Construct

public fun Construct.cfnCloudFormationProduct(
  id: String,
  props: CfnCloudFormationProductProps,
  initializer: CfnCloudFormationProduct.() -> Unit = {},
): CfnCloudFormationProduct = CfnCloudFormationProduct(this, id, props).apply(initializer)
