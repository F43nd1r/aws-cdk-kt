package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.ProductStack
import software.amazon.awscdk.services.servicecatalog.ProductStackProps
import software.constructs.Construct

@Generated
public fun Construct.productStack(id: String, initializer: @AwsCdkDsl ProductStack.() -> Unit = {}): ProductStack = ProductStack(this, id).apply(initializer)

@Generated
public fun Construct.productStack(
  id: String,
  props: ProductStackProps,
  initializer: @AwsCdkDsl ProductStack.() -> Unit = {},
): ProductStack = ProductStack(this, id, props).apply(initializer)

@Generated
public fun Construct.buildProductStack(id: String, initializer: @AwsCdkDsl ProductStack.Builder.() -> Unit = {}): ProductStack = ProductStack.Builder.create(this, id).apply(initializer).build()
