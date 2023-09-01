package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl ProductStackHistory.() -> Unit = {},
): ProductStackHistory = ProductStackHistory(this, id, props).apply(initializer)

@Generated
public fun Construct.buildProductStackHistory(id: String, initializer: @AwsCdkDsl
    ProductStackHistory.Builder.() -> Unit = {}): ProductStackHistory =
    ProductStackHistory.Builder.create(this, id).apply(initializer).build()
