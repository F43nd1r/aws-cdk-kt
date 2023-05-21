package com.faendir.awscdkkt.services.athena

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
  initializer: CfnDataCatalog.() -> Unit = {},
): CfnDataCatalog = CfnDataCatalog(this, id, props).apply(initializer)
