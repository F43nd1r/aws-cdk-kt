package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscovery
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPAMResourceDiscovery(id: String, initializer: @AwsCdkDsl CfnIPAMResourceDiscovery.() -> Unit = {}): CfnIPAMResourceDiscovery = CfnIPAMResourceDiscovery(this, id).apply(initializer)

@Generated
public fun Construct.cfnIPAMResourceDiscovery(
  id: String,
  props: CfnIPAMResourceDiscoveryProps,
  initializer: @AwsCdkDsl CfnIPAMResourceDiscovery.() -> Unit = {},
): CfnIPAMResourceDiscovery = CfnIPAMResourceDiscovery(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIPAMResourceDiscovery(id: String, initializer: @AwsCdkDsl CfnIPAMResourceDiscovery.Builder.() -> Unit = {}): CfnIPAMResourceDiscovery = CfnIPAMResourceDiscovery.Builder.create(this, id).apply(initializer).build()
