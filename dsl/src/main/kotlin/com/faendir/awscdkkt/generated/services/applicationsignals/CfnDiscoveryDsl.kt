package com.faendir.awscdkkt.generated.services.applicationsignals

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationsignals.CfnDiscovery
import software.amazon.awscdk.services.applicationsignals.CfnDiscoveryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDiscovery(id: String, initializer: @AwsCdkDsl CfnDiscovery.() -> Unit = {}):
    CfnDiscovery = CfnDiscovery(this, id).apply(initializer)

@Generated
public fun Construct.cfnDiscovery(
  id: String,
  props: CfnDiscoveryProps,
  initializer: @AwsCdkDsl CfnDiscovery.() -> Unit = {},
): CfnDiscovery = CfnDiscovery(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDiscovery(id: String, initializer: @AwsCdkDsl
    CfnDiscovery.Builder.() -> Unit = {}): CfnDiscovery = CfnDiscovery.Builder.create(this,
    id).apply(initializer).build()
