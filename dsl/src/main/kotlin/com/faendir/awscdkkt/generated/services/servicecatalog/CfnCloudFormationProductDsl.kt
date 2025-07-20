package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnCloudFormationProduct.() -> Unit = {},
): CfnCloudFormationProduct = CfnCloudFormationProduct(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCloudFormationProduct(id: String, initializer: @AwsCdkDsl CfnCloudFormationProduct.Builder.() -> Unit = {}): CfnCloudFormationProduct = CfnCloudFormationProduct.Builder.create(this, id).apply(initializer).build()
