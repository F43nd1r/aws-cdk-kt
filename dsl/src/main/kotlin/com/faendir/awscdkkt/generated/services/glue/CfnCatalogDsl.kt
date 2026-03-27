package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCatalog
import software.amazon.awscdk.services.glue.CfnCatalogProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCatalog(
  id: String,
  props: CfnCatalogProps,
  initializer: @AwsCdkDsl CfnCatalog.() -> Unit = {},
): CfnCatalog = CfnCatalog(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCatalog(id: String, initializer: @AwsCdkDsl CfnCatalog.Builder.() -> Unit = {}): CfnCatalog = CfnCatalog.Builder.create(this, id).apply(initializer).build()
