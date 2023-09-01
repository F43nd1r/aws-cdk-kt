package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCloudFormationProvisionedProduct(id: String, initializer: @AwsCdkDsl
    CfnCloudFormationProvisionedProduct.() -> Unit = {}): CfnCloudFormationProvisionedProduct =
    CfnCloudFormationProvisionedProduct(this, id).apply(initializer)

@Generated
public fun Construct.cfnCloudFormationProvisionedProduct(
  id: String,
  props: CfnCloudFormationProvisionedProductProps,
  initializer: @AwsCdkDsl CfnCloudFormationProvisionedProduct.() -> Unit = {},
): CfnCloudFormationProvisionedProduct = CfnCloudFormationProvisionedProduct(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnCloudFormationProvisionedProduct(id: String, initializer: @AwsCdkDsl
    CfnCloudFormationProvisionedProduct.Builder.() -> Unit = {}):
    CfnCloudFormationProvisionedProduct = CfnCloudFormationProvisionedProduct.Builder.create(this,
    id).apply(initializer).build()
