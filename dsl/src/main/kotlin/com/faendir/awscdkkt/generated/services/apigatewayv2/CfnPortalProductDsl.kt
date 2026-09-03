package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnPortalProduct
import software.amazon.awscdk.services.apigatewayv2.CfnPortalProductProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPortalProduct(
  id: String,
  props: CfnPortalProductProps,
  initializer: @AwsCdkDsl CfnPortalProduct.() -> Unit = {},
): CfnPortalProduct = CfnPortalProduct(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPortalProduct(id: String, initializer: @AwsCdkDsl CfnPortalProduct.Builder.() -> Unit = {}): CfnPortalProduct = CfnPortalProduct.Builder.create(this, id).apply(initializer).build()
