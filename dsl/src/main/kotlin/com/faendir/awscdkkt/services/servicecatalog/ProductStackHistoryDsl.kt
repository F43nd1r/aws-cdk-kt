package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.ProductStackHistory
import software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps
import software.constructs.Construct

@Generated
public fun Construct.productStackHistory(
  id: String,
  props: ProductStackHistoryProps,
  initializer: ProductStackHistory.() -> Unit = {},
): ProductStackHistory = ProductStackHistory(this, id, props).apply(initializer)
