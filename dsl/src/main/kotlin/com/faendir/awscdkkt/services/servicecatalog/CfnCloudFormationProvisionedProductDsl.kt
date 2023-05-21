package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCloudFormationProvisionedProduct(id: String,
    initializer: CfnCloudFormationProvisionedProduct.() -> Unit = {}):
    CfnCloudFormationProvisionedProduct = CfnCloudFormationProvisionedProduct(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnCloudFormationProvisionedProduct(
  id: String,
  props: CfnCloudFormationProvisionedProductProps,
  initializer: CfnCloudFormationProvisionedProduct.() -> Unit = {},
): CfnCloudFormationProvisionedProduct = CfnCloudFormationProvisionedProduct(this, id,
    props).apply(initializer)
