@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iotfleetwise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalogProps
import software.constructs.Construct

public fun Construct.cfnSignalCatalog(id: String, initializer: CfnSignalCatalog.() -> Unit = {}):
    CfnSignalCatalog = CfnSignalCatalog(this, id).apply(initializer)

public fun Construct.cfnSignalCatalog(
  id: String,
  props: CfnSignalCatalogProps,
  initializer: CfnSignalCatalog.() -> Unit = {},
): CfnSignalCatalog = CfnSignalCatalog(this, id, props).apply(initializer)
