@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.ProductStack
import software.amazon.awscdk.services.servicecatalog.ProductStackProps
import software.constructs.Construct

public fun Construct.productStack(id: String, initializer: ProductStack.() -> Unit = {}):
    ProductStack = ProductStack(this, id).apply(initializer)

public fun Construct.productStack(
  id: String,
  props: ProductStackProps,
  initializer: ProductStack.() -> Unit = {},
): ProductStack = ProductStack(this, id, props).apply(initializer)
