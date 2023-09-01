package com.faendir.awscdkkt.generated.services.athena

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnDataCatalog
import software.amazon.awscdk.services.athena.CfnDataCatalogProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataCatalog(
  id: String,
  props: CfnDataCatalogProps,
  initializer: @AwsCdkDsl CfnDataCatalog.() -> Unit = {},
): CfnDataCatalog = CfnDataCatalog(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataCatalog(id: String, initializer: @AwsCdkDsl
    CfnDataCatalog.Builder.() -> Unit = {}): CfnDataCatalog = CfnDataCatalog.Builder.create(this,
    id).apply(initializer).build()
