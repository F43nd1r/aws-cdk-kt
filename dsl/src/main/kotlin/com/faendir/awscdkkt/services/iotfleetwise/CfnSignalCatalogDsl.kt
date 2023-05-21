package com.faendir.awscdkkt.services.iotfleetwise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSignalCatalog(id: String, initializer: CfnSignalCatalog.() -> Unit = {}):
    CfnSignalCatalog = CfnSignalCatalog(this, id).apply(initializer)

@Generated
public fun Construct.cfnSignalCatalog(
  id: String,
  props: CfnSignalCatalogProps,
  initializer: CfnSignalCatalog.() -> Unit = {},
): CfnSignalCatalog = CfnSignalCatalog(this, id, props).apply(initializer)
