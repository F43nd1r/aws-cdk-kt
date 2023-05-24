package com.faendir.awscdkkt.generated.services.eventschemas

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnDiscoverer
import software.amazon.awscdk.services.eventschemas.CfnDiscovererProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDiscoverer(id: String, props: CfnDiscovererProps): CfnDiscoverer =
    CfnDiscoverer(this, id, props)

@Generated
public fun Construct.cfnDiscoverer(
  id: String,
  props: CfnDiscovererProps,
  initializer: @AwsCdkDsl CfnDiscoverer.() -> Unit,
): CfnDiscoverer = CfnDiscoverer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDiscoverer(id: String, initializer: @AwsCdkDsl
    CfnDiscoverer.Builder.() -> Unit): CfnDiscoverer = CfnDiscoverer.Builder.create(this,
    id).apply(initializer).build()
