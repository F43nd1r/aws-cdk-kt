package com.faendir.awscdkkt.services.iotfleetwise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifest
import software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelManifest(
  id: String,
  props: CfnModelManifestProps,
  initializer: CfnModelManifest.() -> Unit = {},
): CfnModelManifest = CfnModelManifest(this, id, props).apply(initializer)
