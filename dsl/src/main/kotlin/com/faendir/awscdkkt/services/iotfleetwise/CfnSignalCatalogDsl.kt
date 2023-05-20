@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
