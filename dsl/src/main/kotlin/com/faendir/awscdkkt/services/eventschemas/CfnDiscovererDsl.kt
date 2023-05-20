@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.eventschemas

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnDiscoverer
import software.amazon.awscdk.services.eventschemas.CfnDiscovererProps
import software.constructs.Construct

public fun Construct.cfnDiscoverer(
  id: String,
  props: CfnDiscovererProps,
  initializer: CfnDiscoverer.() -> Unit = {},
): CfnDiscoverer = CfnDiscoverer(this, id, props).apply(initializer)
