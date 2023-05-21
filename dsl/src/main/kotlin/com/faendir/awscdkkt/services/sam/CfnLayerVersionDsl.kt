package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnLayerVersion
import software.amazon.awscdk.services.sam.CfnLayerVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLayerVersion(id: String, initializer: CfnLayerVersion.() -> Unit = {}):
    CfnLayerVersion = CfnLayerVersion(this, id).apply(initializer)

@Generated
public fun Construct.cfnLayerVersion(
  id: String,
  props: CfnLayerVersionProps,
  initializer: CfnLayerVersion.() -> Unit = {},
): CfnLayerVersion = CfnLayerVersion(this, id, props).apply(initializer)
