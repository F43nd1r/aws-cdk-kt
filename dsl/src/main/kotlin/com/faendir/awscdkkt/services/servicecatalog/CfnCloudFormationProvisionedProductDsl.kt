@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps
import software.constructs.Construct

public fun Construct.cfnCloudFormationProvisionedProduct(
  id: String,
  props: CfnCloudFormationProvisionedProductProps,
  initializer: CfnCloudFormationProvisionedProduct.() -> Unit = {},
): CfnCloudFormationProvisionedProduct = CfnCloudFormationProvisionedProduct(this, id,
    props).apply(initializer)

public fun Construct.cfnCloudFormationProvisionedProduct(id: String,
    initializer: CfnCloudFormationProvisionedProduct.() -> Unit = {}):
    CfnCloudFormationProvisionedProduct = CfnCloudFormationProvisionedProduct(this,
    id).apply(initializer)
