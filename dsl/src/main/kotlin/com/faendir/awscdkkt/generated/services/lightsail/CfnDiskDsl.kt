package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDisk
import software.amazon.awscdk.services.lightsail.CfnDiskProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDisk(id: String, props: CfnDiskProps): CfnDisk = CfnDisk(this, id, props)

@Generated
public fun Construct.cfnDisk(
  id: String,
  props: CfnDiskProps,
  initializer: @AwsCdkDsl CfnDisk.() -> Unit,
): CfnDisk = CfnDisk(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDisk(id: String, initializer: @AwsCdkDsl CfnDisk.Builder.() -> Unit):
    CfnDisk = CfnDisk.Builder.create(this, id).apply(initializer).build()
